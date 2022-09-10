package practiseStack;

public class Stack_Practise2 {

	private int top = -1;
	private int[] stack = new int[5];

	public boolean isEmpty() {

		return top == -1;

	}

	public boolean isFull() {
		
		return top >= stack.length - 1;

	}

	public void push(int ele) {

		if (!isFull()) {
			top = top + 1;
			stack[top] = ele;
			
			System.out.println("element pushed :" + ele);

		} else
			System.out.println("stack is full");

	}

	public void peek() {

		if (!isEmpty()) {

			System.out.println(stack[top]);

		} else
			System.out.println("stack is Empty");

	}
	
	public void pop() {
		if (!isEmpty()) {
			
			int temp = stack[top];
			top--;

			System.out.println(temp);

		}else
			System.out.println("stack is Empty");
	}
}
