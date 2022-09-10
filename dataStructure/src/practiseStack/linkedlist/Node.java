package practiseStack.linkedlist;

public class Node {
	
	private int item;
	private Node next;
	
	public Node(int item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	public Node(int item) {
		this.item = item;
		this.next = null;
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
