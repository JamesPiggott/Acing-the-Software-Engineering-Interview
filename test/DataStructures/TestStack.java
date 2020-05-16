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
		String s1 = "Hello";
		string.push(s1);
		String s2 = "How";
		string.push(s2);
		String s3 = "Are";
		string.push(s3);
		String s4 = "You";
		string.push(s4);
		
		assert(!string.isEmpty());
		assert(string.size() == 4);
		
		String pop1 = string.pop();
		assert(pop1.equals(s1));
		String pop2 = string.pop();
		assert(pop2.contentEquals("Are"));
		String pop3 = string.pop();
		assert(pop3.contentEquals("How"));
		String pop4 = string.pop();
		assert(pop4.contentEquals("Hello"));
		
		assert(string.isEmpty());
		assert(string.size() == 0);
	}
	
	
}
