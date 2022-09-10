package practiseStack.BinarySearchTree;

public class Node {
	
	 int data;
	 Node left;
	 Node right;
	
	
	public int getData() {
		return data;
	}
	
	public Node(int data) {
		
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void visit() {
		System.out.println("Data item :" + getData());
	}

}
