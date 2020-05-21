package DataStructures;

public class Queue {
	
	private LinkedList first;
	private LinkedList last;
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
	
	public void insert(Object object) {
		LinkedList toInsert = new LinkedList(object);
		
		if (first == null) {
			first = toInsert;
			N++;
		} else {
//			toPush.setNext(first);
//			first = toPush;
			N++;
		}
	}
	
	public Object remove() {
		Object object = (Object) first.getObject();
		first = first.getNext();
		N--;
		return object;
	}

}
