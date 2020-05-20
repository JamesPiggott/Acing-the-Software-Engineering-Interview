package DataStructures;

@SuppressWarnings("hiding")
public class Stack<Object> {
	
	private LinkedList first;
	private int N;
	
	public boolean isEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return N;
	}
	
	public void push(Object word) {
		LinkedList toPush = new LinkedList(word);
	
		if (first == null) {
			first = toPush;
			N++;
		} else {
			toPush.setNext(first);
			first = toPush;
			N++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Object pop() {
		Object object = (Object) first.getObject();
		first = first.getNext();
		N--;
		return object;
	}
}
