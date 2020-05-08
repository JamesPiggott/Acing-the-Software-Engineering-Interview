package DataStructures;

import org.junit.Test;

public class TestHashTableChaining {

	@Test
	public void testHash() {		
		HashTableChaining table = new HashTableChaining();
		
		System.out.println(table.hash("aaaaaa"));
		
		System.out.println(table.hash("zzzzzz"));
	}
	
	@Test
	public void testSimple() {
		HashTableChaining table = new HashTableChaining();
		table.add("aaa", 10);

		System.out.println(table.exists("aaa"));
		System.out.println(table.get("aaa"));
		table.remove("aaa");
		System.out.println(table.exists("aaa"));
	}
}
