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
	
	public void push(Object o) {
		if (first == null) {
			first = new LinkedList(o);
		} else {
			LinkedList oldfirst = first;
			LinkedList first = new LinkedList(o);
			first.setNext(oldfirst);
		}
		N++;
	}
	
	@SuppressWarnings("unchecked")
	public Object pop() {
		Object object = (Object) first.getObject();
		first = first.getNext();
		N--;
		return (Object) object;
	}
}
