package DAY4;

public class LinkedL {
	static node1 head;
	static node1 tail;

	public static void main(String[] args) {
		node1 n = new node1(28);

		LinkedL ll = new LinkedL();
		tail = head = n;
		ll.insertAtHead(45);
		ll.insertAtHead(56);
		ll.insertAtHead(63);
		ll.insertAtTail(16);
		ll.insertBefore(506, 58);
		ll.insertAfter(126, 14);
		ll.traverse(head);
		ll.deleteBeginning();
		ll.traverse(head);
		ll.deleteAtEnd();
		ll.traverse(head);
		ll.deleteGivenData(16);
		ll.traverse(head);
		ll.deleteAfter(45);
		ll.traverse(head);
		ll.insertAfter(45, 36);
		System.out.println("");
		ll.traverse(head);
		ll.deleteBefore(58);
		ll.traverse(head);
		
        
	}

	void insertAtHead(int data) {
		node1 newNode = new node1(data);
		newNode.next = head;
		head = newNode;

	}

	void insertAtTail(int data) {
		node1 newNode = new node1(data);
		tail.next = newNode;
		newNode = tail;

	}

	void insertBefore(int dataBefore, int data) {

		node1 newNode = new node1(data);
		node1 tempNode = head;

		while (tempNode.next != null && tempNode.next.data != dataBefore) {

			tempNode = tempNode.next;

		}

		newNode.next = tempNode.next;
		tempNode.next = newNode;

	}

	void insertAfter(int dataAfter, int data) {

		node1 newNode = new node1(data);
		node1 tempNode = head;

		while (tempNode.next != null && tempNode.data != dataAfter) {
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;

	}

	void deleteBeginning() {
		node1 tempNode = head;
		head = tempNode.next;
		System.out.println("");

	}

	void deleteAtEnd() {
		node1 tempNode = head;
		while (tempNode.next.next != null) {
			tempNode = tempNode.next;

		}
		tail = tempNode;
		tempNode.next = null;
		System.out.println("");
	}

	void deleteGivenData(int data) {
		node1 tempNode = head;
		
		while (tempNode.next.data != data && tempNode.next != null) {

			tempNode = tempNode.next;
		}

		tempNode.next = tempNode.next.next;
		System.out.println("");
	}
	void deleteAfter(int data) {
		node1 tempNode=head;
		while(tempNode.data!= data && tempNode.next!=null) {
			tempNode=tempNode.next;
			
		}
		tempNode.next=tempNode.next.next;
		System.out.println("");
		
	}
	
	void deleteBefore(int data) {
		node1 tempNode= head;
		while(tempNode.next.next.data!=data && tempNode.next!=null) {
			tempNode=tempNode.next;
			
		}
		tempNode.next=tempNode.next.next;
		System.out.println("");
		
	}

	void traverse(node1 newNode) {
		while (newNode != null) {

			System.out.print(newNode.data + "---->");

			newNode = newNode.next;

		}

	}
	// deleteBeginning(), deleteBefore(), deleteAfter(), deleteEnd()

}

class node1 {

	int data;
	node1 next;

	 public node1(int data) {

		this.data = data;
		this.next = null;
	}

}
