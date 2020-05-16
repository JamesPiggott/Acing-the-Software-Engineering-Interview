package DataStructures;

public class LinkedList {
		
    private String key; 
    private int value; 
    private LinkedList next;
    private Object object;

    LinkedList(String key, int value) { 
          this.key = key; 
          this.value = value; 
          this.next = null; 
    }
    
    LinkedList(Object object) { 
    	this.object = object;
        this.next = null; 
    }

    public Object getObject() {
    	return this.object;
    }

    public int getValue() { 
        return value; 
    } 

    public void setValue(int value) { 
        this.value = value; 
    } 

    public String getKey() { 
    	return key; 
    } 

    public LinkedList getNext() { 
        return next; 
    } 

    public void setNext(LinkedList next) { 
        this.next = next; 
    } 
}
