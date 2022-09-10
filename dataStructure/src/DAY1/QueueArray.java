package DAY1;

public class QueueArray {
   private int top;
   private int bottom;
   private Integer[] queue;
    
   QueueArray(int n){
	   top=-1;
	   bottom=0;
	   int size=n;
	   queue= new Integer[size];   
	 
   }
   
   public boolean isEmpty() {
	   return top==-1;
   }
   
   public boolean isFull() {
	   return top==queue.length-1;
   }
   
   public void clear() {
	   top=-1;
   }
   
   public void enqueue(int ele) throws Exception {
	   
	   if(!isFull()) {
		   top++;
		   queue[top]= ele;
	   }else throw new Exception("queue is full!");
	   
   }
   
   public Integer dequeue() throws Exception {
	   if(!isEmpty()) {
		   Integer temp = queue[bottom];
		   bottom++;
		   return temp;
	   }else throw new Exception("queue is empty!");
	   
   }
   
   public Integer firstEl() throws Exception {
	   if(!isEmpty()) {
		   Integer temp = queue[top];
		   return temp;
	   }else throw new Exception("queue is empty!");
   }
}
