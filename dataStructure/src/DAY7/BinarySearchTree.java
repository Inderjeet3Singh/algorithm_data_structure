package DAY7;

class Bnode {
	private int item;
	Bnode left; // reference to the left sub tree;
	Bnode right; // reference to the right sub tree;

	public Bnode(int item) {
		this.item = item;
		this.left = null;
		this.right = null;
	}

	public int getItem() {
		return item;
	}

	public void visit() {
		System.out.println("Data Item :" + getItem());

	}
}

public class BinarySearchTree {
	Bnode root;

	public void insert(Bnode p, int ele) {
		if (p == null) {
			p = new Bnode(ele);
			System.out.println(" node inserted at root : " + ele);
			root = p;
			return;
		}

		if (p.getItem() > ele) {
			if (p.left == null) {
				p.left = new Bnode(ele);
				System.out.println("new node inserted at left : " + ele);
				return;

			} else {
				insert(p.left, ele);

			}
		} else {
			if (p.right == null) {
				p.right = new Bnode(ele);
				System.out.println("new node inserted at right: " + ele);
				return;
			} else {
				insert(p.right, ele);

			}

		}

	}

	void preorder(Bnode p) {
		// visit,left,right
		if (p != null) {
			p.visit();
			preorder(p.left);
			preorder(p.right);

		}
	}

	void postorder(Bnode p) {
		// left,right,visit
		if (p != null) {
			postorder(p.left);
			postorder(p.right);
			p.visit();

		}

	}

	void inorder(Bnode p) {
		// left,visit,right
		if (p != null) {
			inorder(p.left);
			p.visit();
			inorder(p.right);

		}

	}

	Bnode search(Bnode p, int ele) {
		if (p != null) {
			if (p.getItem() == ele)
				return p;
			else if (ele < p.getItem())
				p = search(p.left, ele);
			else
				p = search(p.right, ele);

		}
		return p;

	}

	public static void main(String[] args) {

		BinarySearchTree bs = new BinarySearchTree();

		bs.insert(bs.root, 8);
		bs.insert(bs.root, 9);
		bs.insert(bs.root, 10);
		bs.insert(bs.root, 6);
		bs.insert(bs.root, 15);
		bs.insert(bs.root, 5);
		bs.insert(bs.root, 7);
		bs.insert(bs.root, 13);
		System.out.println("\n preorder");

		bs.preorder(bs.root);

		System.out.println("\n postorder");

		bs.postorder(bs.root);

		System.out.println("\n inorder");

		bs.inorder(bs.root);
          
		System.out.println("\nsearching of an element");
		Bnode k=bs.search(bs.root, 15);
		
		if(k!=null) {
			System.out.println(k.getItem() + "  element is present");
			
		}else {
			System.out.println("element is not present");
		}
	}

}