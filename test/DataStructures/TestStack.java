package DataStructures;

import org.junit.Test;

public class TestStack {
	
	@Test
	public void testIsEmpty() {
		Stack<String> string = new Stack<String>();
		assert(string.isEmpty());

		string.push("Hello");
		assert(!string.isEmpty());
	}
	
	@Test
	public void testSize() {
		Stack<String> string = new Stack<String>();
		assert(string.size() == 0);
		
		string.push("Hello");
		assert(string.size() == 1);
	}
	
	@Test
	public void testPushAndPop() {
		Stack<String> string = new Stack<String>();
		string.push("Hello");
		string.push("How");
		string.push("Are");
		string.push("You");
		
		assert(!string.isEmpty());
		assert(string.size() == 4);
		
//		assert(string.pop().equals("You"));
//		assert(string.pop().equals("Are"));
//		assert(string.pop().equals("How"));
//		assert(string.pop().equals("Hello"));
//		
//		assert(string.isEmpty());
//		assert(string.size() == 0);
	}
}
