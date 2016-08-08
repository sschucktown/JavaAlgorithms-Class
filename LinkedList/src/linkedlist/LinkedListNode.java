
package linkedlist;


public class LinkedListNode<T> {
    private Comparable<T> data;
    private LinkedListNode<T> next;
    public LinkedListNode( Comparable<T> comparable){
        data=comparable;
        next=null;
    }
    @Override
    public String toString(){
        return data.toString();
    }

    public Comparable<T> getData() {
        return data;
    }

    public void setData(Comparable<T> data) {
        this.data = data;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }
}
