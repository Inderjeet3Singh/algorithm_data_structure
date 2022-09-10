package DAY5;

public class CircularList {
	Node head;

	public CircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void insertBeginning(int data) {
		Node newNode = new Node(data);
		if (!isEmpty()) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
		} else {
			head = newNode;
			newNode.setNext(newNode);

		}
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if (!isEmpty()) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			head = newNode;
		} else {
			head = newNode;
			newNode.setNext(newNode);
		}
	}

	public void insertBefore(int dataBefore, int data) {
		Node newNode = new Node(data);
		Node prev = findPrevious(dataBefore);
		if (prev != null) {
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		} else
			System.out.println("ENA");

	}

	public void insertAfter(int dataAfter, int data) throws Exception {
		Node newNode = new Node(data);
		Node curr = findNode(dataAfter);

		newNode.setNext(curr.getNext());
		curr.setNext(newNode);

	}

	public Node findNode(int data) throws Exception {
		if (!isEmpty()) {
			Node tempNode = head.getNext();
			do {
				if (tempNode.getData() == data)
					return tempNode;
				else
					tempNode = tempNode.getNext();

			} while (tempNode != head);
			if (tempNode.getData() == data)
				return tempNode;
			else
				throw new Exception("node not found");
		} else
			throw new Exception("List is empty");

	}

	private Node findPrevious(int dataBefore) {
		Node tempNode = head.getNext();
		Node prev = null;
		while (tempNode != head) {
			if (tempNode.getNext().getData() == dataBefore) {
				prev = tempNode;
			}

			tempNode = tempNode.getNext();

		}

		return prev;
	}

	public void traverse() {

		if (!isEmpty()) {
			Node tempNode = head.getNext();
			while (tempNode != head) {
				System.out.println(tempNode.getData() + " ---->");
				tempNode = tempNode.getNext();
			}
			System.out.println(tempNode.getData() + "----->");
		} else {
			System.out.println("set is empty");
		}
	}

	public static void main(String[] args) throws Exception {
		CircularList cl = new CircularList();

		cl.insertBeginning(25);
		cl.insertBeginning(28);
		cl.insertBeginning(36);
		cl.insertEnd(22);
		cl.insertEnd(18);
		cl.insertBefore(28, 32);
		cl.insertBefore(18, 19);
		cl.insertAfter(28, 27);

		cl.traverse();

	}

}

class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
