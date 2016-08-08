
package linkedlist;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    public LinkedList(){
        head=new LinkedListNode(null);
    }
    public boolean isEmpty(){
        return head.getNext()==null;
    }

    // for example insert list head->1->3->4->null and we want to insert 5
    public Comparable<T> insert(Comparable<T>data){
        LinkedListNode<T> tmp = new LinkedListNode<>(data); // we create a node 5->null, lets call it tmp node
        tmp.setNext(head.getNext()); // now next of tmp node set to first node
        head.setNext(tmp); // next of head is set to tmp node
        return tmp.getData();
    }

    // keep track of two node. the node curr node and previous ot curr node
    // once you find that curr node data is same the data that we want to remove
    // just set next of prev node to next of curr node and set currnode next to null

    public Comparable<T> remove(Comparable<T> item){
        LinkedListNode<T> prev = head;
        LinkedListNode<T> curr = head.getNext();
        while (curr != null){
            if(curr.getData().compareTo((T)item)==0){
                prev.setNext(curr.getNext());
                curr.setNext(null);
                return curr.getData();
            }
            curr=curr.getNext();
            prev=prev.getNext();
        }
        return null;
    }

    // iterate and check if data that we want to find is equal to curr node

    public Comparable<T> find(Comparable<T> item){
        LinkedListNode<T> toReturn = null;
        LinkedListNode<T> curr = head.getNext();
        while (curr != null){
            if(curr.getData().compareTo((T)item)==0){
                return curr.getData();
            }
            curr=curr.getNext();
        }
        return null;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        LinkedListNode<T> curr = head.getNext();
        while (curr != null){
            sb.append(curr.toString()+", ");
            curr=curr.getNext();
        }
        return sb.toString();

    }

}

