package DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestHashTable {
	
	@Test
	public void test() {
		HashTable table = new HashTable();
		assertEquals(97, table.hash("abc"));
		assertEquals(97, table.hash("adb"));
	}
	
	@Test
	public void testCollision() {
		HashTable table = new HashTable();
		table.add("abc", 123);
		table.add("adb", 142);
		
		assert(table.exists("abc"));
	}

}
