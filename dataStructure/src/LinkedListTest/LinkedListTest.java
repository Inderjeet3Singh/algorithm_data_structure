package LinkedListTest;

public class LinkedListTest {
	 Node head;
		Node tail;
		
		public LinkedListTest() {
			head=tail=null;
		}
		
		public boolean isEmpty() {
			return head== null;
		}
		
		public void insertAtBeginning(int item) {
			Node temp=new Node(item);
			temp.setNext(head);
			head=temp;
			
			if(tail== null)
				tail=head;
		}
		
		public void insertAtEnd(int item) {
			Node temp =new Node(item);
			temp.setNext(null);
			if (tail!=null)
				tail.setNext(temp);
			if(tail==null)
				head=tail=temp;
			else
				tail=temp;
			

			}
		
		public void delEnd() {
			if (!isEmpty()) {
				Node prev = findPreviousNode(tail);
				if (prev == null) {
					head = head.getNext();
					head = head.getNext();
				}
				else {
					prev.setNext(tail.getNext());
					tail = prev;
			}
			}	
		}
		
		Node findPreviousNode(Node ref) {
			Node prev = null;
			Node curr = head;
			while (curr!=null) {
				if (curr == ref) break;
			else {
				prev = curr;
				curr = curr.getNext();

			}
		}return prev;


		}
		
		public void traverse() {
			if(!isEmpty()) {
				Node tmp=head;
				do {
					System.out.println(tmp.getItem());
					tmp=tmp.getNext();
				}while(tmp!=null);
					
				}else
					System.out.println("list is empty");
			}
		
		public static void main(String[] args) {
			LinkedListTest ll= new LinkedListTest();
			ll.insertAtBeginning(25);
			ll.insertAtBeginning(26);
			ll.insertAtEnd(24);
			ll.insertAtEnd(23);
			ll.traverse();
			ll.delEnd();
			ll.traverse();
		}


}


class Node {
	private int item;
	private Node next;
	
	public Node(int item) {
		this.item=item;
		this.next=null;
	}
	
	public Node(int item, Node next) {
		this.item=item;
		this.next=next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getItem() {
		return item;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}

}
