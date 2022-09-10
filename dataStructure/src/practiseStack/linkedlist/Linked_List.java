package practiseStack.linkedlist;

public class Linked_List {

	Node head;

	public Linked_List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtBeginning(int item) {
		Node newNode = new Node(item);

		if (head != null) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);

		} else {
			head = newNode;
			head.setNext(newNode);

		}

	}

	public void insertAtEnd(int item) {
		Node newNode = new Node(item);

		if (head != null) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			head = newNode;
		} else {
			head = newNode;
			head.setNext(newNode);

		}

	}

	public void insertAfter(Node x, int item) {
		Node newNode = new Node(item);

		newNode.setNext(x.getNext());
		x.setNext(newNode);

		if (head == x) { // what if x was head
			head = newNode;
		}

	}

	public void traverse() throws Exception {
		if (!isEmpty()) {

			Node temp = head.getNext();
			while (temp != head) {
				System.out.println(temp.getItem());
				System.out.println("------->");
				temp = temp.getNext();
			}

			System.out.println(temp.getItem());
		}
		throw new Exception("List is Empty");
	}

	public Node findNode(int x) throws Exception {
		if (!isEmpty()) {
			Node temp = head.getNext();

			do {
				if (temp.getItem() == x)
					return temp;
				else
					temp = temp.getNext();
			} while (temp != head);

			if (temp.getItem() == x)
				return temp;
			else
				throw new Exception("Node not found");
		}
		throw new Exception("list is Empty");

	}

	private Node findPrevious(int x) {
		Node prev = null;
		Node temp = head.getNext();

		while (temp != head) {
			if (temp.getNext().getItem() == x) {
				prev = temp;
			}
			temp = temp.getNext();
		}

		return prev;
	}

	public void insertBefore(int x, int data) {
		Node newNode = new Node(data);
		Node prev = findPrevious(x);

		if (prev != null) {
			newNode.setNext(prev.getNext());

			prev.setNext(newNode);
		} else
			System.out.println("Link is Empty");
	}

}