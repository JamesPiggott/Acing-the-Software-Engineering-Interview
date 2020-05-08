package DataStructures;

@SuppressWarnings("hiding")
public class Stack<Object> {
	
	private LinkedList first;
	private int N;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Object o) {
//		LinkedList oldfirst = first;
//		first = new LinkedList();
//		first.object = o;
//		first.next = oldfirst;
//		N++;
	}
	
//	public Object pop() {
////		@SuppressWarnings("unchecked")
////		Object object = (Object) first.object;
////		first = first.next;
////		N--;
////		return object;
//	}
}
