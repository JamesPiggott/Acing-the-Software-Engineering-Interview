package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * A simple implementation if Breadth-first Search that uses an adjacency list
 * in the form of a LinkedList.
 * 
 * TODO: implement graph reader, automatic resizing and shortest path description
 * 
 * @author James Piggott
 *
 */

public class BreadFirstSearch {
	
	private int vertices;
	private LinkedList<Integer>[] adjacencyList;
	
	/*
	 * Initialize global variables: vertices and adjacencyList
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BreadFirstSearch(int vertices) {
		this.vertices = vertices;
		this.adjacencyList = new LinkedList[vertices];
		
        for (int i = 0; i < this.vertices; i++) {
        	adjacencyList[i] = new LinkedList();
        }    
	}
	
	public void addEdge(int from, int to) {
		adjacencyList[from].add(to);
	}
	
	/*
	 * Find the path from source to destination vertex
	 */
	public void findPath(int source, int destination) {
		
		// boolean array to mark all vertices visited
		boolean[] visited = new boolean[this.vertices];
		
		// queue for all vertices to visit
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		// mark the first vertex as visited
		visited[source] = true;
		
		// enqueue the first vertex
		queue.add(source);
		
		// while the queue has more vertices
		while(queue.size() != 0) {
			
			// dequeue vertex for examination, remember queue is FIFO
			int vertex = queue.poll();
			
			Iterator<Integer> adjacent = this.adjacencyList[vertex].listIterator();
			
			while(adjacent.hasNext()) {
				int next = adjacent.next();
				
				if (next == destination) {
					System.out.println("Destination vertex found!"); 
					break;
				}
				
				if (visited[next] == false) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}

	public static void main(String[] args) {
		BreadFirstSearch bfs = new BreadFirstSearch(4);
		
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		
		bfs.findPath(0, 3);
	}
}
