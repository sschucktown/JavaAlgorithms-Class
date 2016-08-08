package calendar;




public class LinkedList 
{
    private LinkedListNode head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public Comparable<Object> remove(Comparable<Object> item){
        if(isEmpty()){
            return null;
        }
        if (item.compareTo(this.head.getData()) == 0){
            LinkedListNode temp = this.head;
            this.head = this.head.getNext();
            return temp.getData();
        }
        LinkedListNode current = this.head.getNext();
        LinkedListNode previous = this.head;
        while (current != null){
            if (item.compareTo(current.getData()) == 0){
                previous.setNext(current.getNext());
                return current.getData();
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }
    
    public Comparable<Object> find(Comparable<Object> item){
        LinkedListNode node = head;
        while(node != null){
            if(item.compareTo(node.getData()) == 0){
                return node.getData();
            }
            node = node.getNext();
        }
        return null;
    }
    
    public void insert(Comparable<Object> item){
		if(this.head == null){
			this.head = new LinkedListNode(item);
		}
        else if(item.compareTo(this.head.getData()) <= 0){
			// In this case, items goes to the front of the list
			LinkedListNode temp = new LinkedListNode(item);
			temp.setNext(head);
			this.head = temp;
		}else{
			LinkedListNode current = this.head;
            while (current.getNext() != null){
                if (item.compareTo(current.getNext().getData()) <= 0){
                    LinkedListNode temp = new LinkedListNode(item);
                    temp.setNext(current.getNext());
                    current.setNext(temp);
                    break;
                }
                else
                    current = current.getNext();
            }
		}
		
	}
    
    public String toString(){
        String s = "";
        LinkedListNode printCurrent = this.head;
        while(printCurrent != null){
            s += printCurrent.getData().toString();
            s += "----------------------------------------------------------\n";
            printCurrent = printCurrent.getNext();
        }
        return s;
    }
    
    public LinkedListNode getHead(){
        return head;
    }
    
    public void setHead(LinkedListNode head){
        this.head = head;
    }
}
