package practiseStack.linkedlist;

public class TestLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Linked_List ll = new Linked_List();
		ll.insertAtBeginning(1);
		ll.insertAtBeginning(2);
		ll.insertAtBeginning(3);
		ll.insertAtEnd(4);
		ll.insertAtBeginning(5);
		ll.insertAtBeginning(6);
		
		ll.traverse();

	}

}
