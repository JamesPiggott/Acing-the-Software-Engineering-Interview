package DataStructures;

@SuppressWarnings("hiding")
public class Queue<Object> {
	
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
			last = toInsert;
			N++;
		} else {
			last.setNext(toInsert);
			last = toInsert;
			N++;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Object remove() {
		Object object = (Object) first.getObject();
		first = first.getNext();
		N--;
		return object;
	}

}
