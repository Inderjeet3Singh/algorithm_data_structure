package practiseStack;

public class Queue_Practise {
	
	private int first;
	private int end;
	private int size;
	private int count;
	private Integer[] que;
	
	public Queue_Practise(int n){
		
		first=0;
		end=-1;
		count=0;
		size= n;
		que = new Integer[size];
		
	}
	
	public boolean isEmpty() {
		
		return count == 0;
	}
	
	public boolean isFull() {
		
		return count>=size;
	}
	
	public void enqueue(int ele) throws Exception {
		if(!isFull()) {
			end = (end +1) % size;
			que[end]= ele;
			count = count +1;
		}
		else
			throw new Exception("queue is full");
	}
	
	public void dequeue() throws Exception {
		if(!isEmpty()) {
			int temp= que[first];
			first = (first+1) % size;
			count = count-1;
			System.out.println( temp + ": element removed ");
			
		}else
			throw new Exception("queue is empty");
	}
	
	public void firstEl() throws Exception {
		if(!isEmpty()) {
			int temp= que[first];
			System.out.println("First element :"+ temp);
			
			}
		else 
			throw new Exception("queue is empty");
		
	}
	
	public void allElement() throws Exception {
		if(!isEmpty()) {
			int temp = first;
			for(int i= 0; i<count ; i++) {
				System.out.println(i+" Element = "+que[temp]);
				 temp = (temp+1)%size;
			}
		}else
			throw new Exception("queue is empty");
	}

}
