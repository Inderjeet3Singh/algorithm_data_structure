package DAY2;

public class Node {
	
	private int item; // Data item
	private Node next;  // Reference to the next node

	
	public Node(int item) {
		this.item =item;
		this.next =null;
		
	}
	
	public Node(int item, Node next) {
	
		this.item = item;
		this.next = next;
	}

	public int getItem() {
		return item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class LinkedList{
	Node head;  //First element in linked list
	Node tail;  //last element in linked list
	
	public LinkedList() {
		head=tail=null;	
	}
	
	public boolean isEmpty() {
		//what if there is one node?
		return head== null;
	}
	
	public void insertBeginning (int item) {
        // case1: when the list is empty- when both head and tail are null;
		// case 2: when the list is already having one or many nodes
		Node temp= new Node(item); // create new node;
		
		temp.setNext(head);// always you need to insert before th head node;
		head =temp; // new node becomes the head node;

	    if (tail == null)
	    	tail= head; // this newly inserted node is the only node in the list;
	    
	}
	
	public void insertEnd (int item) {
		
		// case1: when the list is empty- when both head and tail are null;
		// case 2: when the list is already having one or many nodes
		
		Node temp=new Node (item);// create new node
		temp.setNext(tail.getNext());// set new node to refer to whatever tail is currently reffering to
		tail.setNext(temp);// set the current tail nodes next to refer to this new node;
			
	}
	
	public void insertAfter(Node p,int item) {
		Node temp= new Node(item);
		temp.setNext(p.getNext());// make next of new node refer to what 'p' is currently refereing to
		p.setNext(temp); // set 'p' s next node refer to the new node;
		
		//what if p was the last node?
		if (tail == p)
			tail=temp; //newly inserted node is the last node;
	}
	
	public void insertBefore(Node p, int item) {
		// find the node previous to p.
		Node prev = findPreviousNode(p);
		
		Node temp=new Node(item); // create new node
		temp.setNext(p);// make the new node refer to 'p'
		if(prev!=null)
			prev.setNext(temp);//reset the next of 'prev' node to the new node
		
		
		
	}
	
	 Node findPreviousNode(Node ref) {
		Node prev = null;
		Node curr= head;
		 while (curr!= null) {
			 if (curr == ref) break; // we have found the node;
			 else {
				 prev =curr;
				 curr=curr.getNext();
			 }
			 return prev;
		 }
		return curr;
	}

	Node findNode (int x) throws Exception {
		if(!isEmpty()) {
			Node tmp= head;
			do {
				if(tmp.getItem() == x)
					return tmp;
				tmp=tmp.getNext();
			}while (tmp!=null);
			throw new Exception ("node not found");
		}else
		    throw new Exception("list is empty");
		
	}
	
	
	public void traverse() {
		if(!isEmpty()) {
			Node tmp= head;
			do {
				System.out.println(tmp.getItem());
				tmp=tmp.getNext();
			}while (tmp!=null);
			
		}else
		    System.out.println("List is empty");
			
		}
	
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.insertBeginning(5);
		ll.insertEnd(6);
		ll.insertBeginning(4);
		ll.insertEnd(8);
		
		Node t= ll.findNode(8);
		ll.insertBefore(t, 7);
		
		t=ll.findNode(4);
		ll.insertBefore(t, 61);
		
		
	}
	}

