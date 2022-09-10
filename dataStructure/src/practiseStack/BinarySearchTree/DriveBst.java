package practiseStack.BinarySearchTree;

public class DriveBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Bst bst = new Bst();
		bst.insert(bst.root, 11);
		bst.insert(bst.root, 5);
		bst.insert(bst.root, 7);
		bst.insert(bst.root, 9);
		bst.insert(bst.root, 14);
		bst.insert(bst.root, 22);
		bst.insert(bst.root, 16);
		bst.insert(bst.root, 29);
		bst.insert(bst.root, 87);
		bst.insert(bst.root, 43);
		bst.insert(bst.root, 99);
		bst.insert(bst.root, 6);
		
		bst.preorder(bst.root);
		System.out.println();
		bst.postorder(bst.root);
		System.out.println();
		bst.inorder(bst.root);
	}

}
