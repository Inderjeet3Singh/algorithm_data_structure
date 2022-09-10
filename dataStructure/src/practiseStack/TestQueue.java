package practiseStack;

public class TestQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue_Practise q= new Queue_Practise(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.enqueue(6);
		q.allElement();

	}

}
