package practiseStack.BinarySearchTree;

public class Bst {

	Node root;

	public boolean isEmpty() {

		return root == null;
	}

	public void insert(Node p, int data) {

		if (p == null) {
			p = new Node(data);
			root = p;
			return;
		}

		if (p.getData() > data) {
			if (p.left == null) {
				p.left = new Node(data);
				return;
			} else {
				insert(p.left, data);
			}
		} else {
			if (p.right == null) {
				p.right = new Node(data);
				return;
			} else {
				insert(p.right, data);
			}

		}
	}

	public void preorder(Node p) {
		if (p != null) {
			p.visit();
			preorder(p.left);
			preorder(p.right);
		}
	}

	public void postorder(Node p) {
		if (p != null) {
			postorder(p.left);
			postorder(p.right);
			p.visit();
		}
	}

	public void inorder(Node p) {
		if (p != null) {
			inorder(p.left);
			p.visit();
			inorder(p.right);
		}
	}
}
