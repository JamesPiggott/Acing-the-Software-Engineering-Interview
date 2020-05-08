package DataStructures;

import java.util.HashMap;

/**
 * Hash Table implemented with chaining.
 * 
 * To prevent collisions an array of LinkedLists is used.
 * The hash function used the first 3 chars of a string and sums them with a prime number.
 * The hash values range from 0 to 24825, so the array needs to be 24826 in size.
 * 
 * @author James Piggott.
 *
 */

public class HashTableChaining {
	
	private int arraySize;
	private LinkedList[] array;
	
	public HashTableChaining() {
		this.arraySize = this.hash("zzz") + 1;
		this.array = new LinkedList[arraySize];
	}

	public int hash(String key) {
		int hash = 7;
		for (int i = 0; i < 3; i++) {
		    hash = hash * 31 + key.charAt(i);
		}
		return hash-304858;
	}
	
	public void add(String key, int value) {
		int hash = this.hash(key);
		
		LinkedList list = this.array[hash];
		LinkedList addition = new LinkedList(key, value);
		
		if (list == null) {
			list = addition;
		} else {
			list.setNext(addition);
		}
		
		this.array[hash] = list;
	}
	
	public boolean exists(String key) {
		int hash = this.hash(key);
		LinkedList list = this.array[hash];
		LinkedList copy = this.array[hash];
		
		if (list.getKey().equals(key)) {
			return true;
		}

		while (list.getNext() != null) {
			copy = list;
			list = list.getNext();
		}
		return false;
	}
	
	public int get(String key) {
		LinkedList list = this.array[this.hash(key)];
		LinkedList copy = this.array[this.hash(key)];
		
		System.out.println(list.getKey());

		while (list.getNext() != null) {
			if (list.getKey().equals(key)) {
				list.getValue();
			}
			copy = list;
			list = list.getNext();
		}
		return 0;
	}
	
	public void remove(String key) {
		LinkedList list = this.array[this.hash(key)];
		LinkedList copy = this.array[this.hash(key)];
		
		while (true) {
			if (list.getKey().equals(key)) {

			} else {
				copy.setNext(list.getNext());
			}

			copy = list;
			list = list.getNext();
		}
	}
}
