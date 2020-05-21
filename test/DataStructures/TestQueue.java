package DataStructures;

import org.junit.Test;

public class TestQueue {
	@Test
	public void testIsEmpty() {
		Queue<String> queue = new Queue<String>();
		assert(queue.isEmpty());

		queue.insert("Hello");
		assert(!queue.isEmpty());
	}
	
	@Test
	public void testSize() {
		Queue<String> queue = new Queue<String>();
		assert(queue.isEmpty());

		queue.insert("Hello");
		assert(queue.size() == 1);
	}
	
	@Test
	public void testPushAndPop() {
		Queue<String> queue = new Queue<String>();
		String s1 = "Hello";
		queue.insert(s1);
		String s2 = "How";
		queue.insert(s2);
		String s3 = "Are";
		queue.insert(s3);
		String s4 = "You";
		queue.insert(s4);
		
		assert(!queue.isEmpty());
		assert(queue.size() == 4);
		
		String pop1 = queue.remove();
		assert(pop1.equals(s1));
		String pop2 = queue.remove();
		assert(pop2.equals(s2));
		String pop3 = queue.remove();
		assert(pop3.equals(s3));
		String pop4 = queue.remove();
		assert(pop4.equals(s4));
		
		assert(queue.isEmpty());
		assert(queue.size() == 0);
	}
}
