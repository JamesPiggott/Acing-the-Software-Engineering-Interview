package DataStructures;

import org.junit.Test;

public class TestStack {
	
	@Test
	public void testIsEmpty() {
		Stack<String> stack = new Stack<String>();
		assert(stack.isEmpty());

		stack.push("Hello");
		assert(!stack.isEmpty());
	}
	
	@Test
	public void testSize() {
		Stack<String> stack = new Stack<String>();
		assert(stack.size() == 0);
		
		stack.push("Hello");
		assert(stack.size() == 1);
	}
	
	@Test
	public void testPushAndPop() {
		Stack<String> stack = new Stack<String>();
		String s1 = "Hello";
		stack.push(s1);
		String s2 = "How";
		stack.push(s2);
		String s3 = "Are";
		stack.push(s3);
		String s4 = "You";
		stack.push(s4);
		
		assert(!stack.isEmpty());
		assert(stack.size() == 4);
		
		String pop1 = stack.pop();
		assert(pop1.equals(s4));
		String pop2 = stack.pop();
		assert(pop2.equals(s3));
		String pop3 = stack.pop();
		assert(pop3.equals(s2));
		String pop4 = stack.pop();
		assert(pop4.equals(s1));
		
		assert(stack.isEmpty());
		assert(stack.size() == 0);
	}
}
