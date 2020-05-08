package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hash Table implemented with an array using linear probing.
 * 
 * Hash tables creates and associative array using key, value pairs 
 * in which the key is used to determine where to place the value using a hashing function
 * 
 * The same key should hash to the same index, our hashing function should prevent 'collisions' 
 * in which multiple keys hash to the same index. This could be avoided using a LinkedList, also known as chaining
 * 
 * @author James Piggott.
 *
 */

public class HashTable {
	
	private HashMap<Integer, Integer> array;
	
	public HashTable() {
		this.array =  new HashMap<Integer, Integer>();
	}
	
	// A simple hashing function that transforms the key into an location on the array
	public int hash(String key) {
		char first = key.charAt(0);
		int index = 0;
		return index = first;
	}
	
	public void add(String key, int value) {
		int hash = this.hash(key);
		this.array.put(hash, value);
	}
	
	public boolean exists(String key) {
		if (this.array.containsKey(key)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int get(String key) {
		return this.array.get(key);
	}
	
	public void remove(String key) {
		this.array.remove(key);
	}
}
