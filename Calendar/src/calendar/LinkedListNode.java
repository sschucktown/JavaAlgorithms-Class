package calendar;




public class LinkedListNode
{
    
    private Comparable<Object> data;
    private LinkedListNode next;
    
    public LinkedListNode(Comparable<Object> data)
    {
        this.data = data;
        this.next = null;
    }
    
    public Comparable<Object> getData() {
	    return data;
    }
    
    public void setData(Comparable<Object> data){
	    this.data = data;
    }
    
    public LinkedListNode getNext() {
	    return next;
    }
    
    public void setNext(LinkedListNode next) {
	    this.next = next;
    }

    public String toString(){
	    return "" + this.data; 
    }
    
}