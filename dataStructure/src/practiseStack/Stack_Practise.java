package practiseStack;

public class Stack_Practise {

	private int top= -1;
	private int[] stack = new int[5];

	public boolean isEmpty() {

		return top == -1;

	}

	public void clear() {

		top = -1;
		System.out.println("stack cleared");

	}

	public boolean isFull() {

		return top >= stack.length - 1;

	}

	public void push(int ele) throws Exception {
		if (!isFull()) {
			top++;
			stack[top] = ele;
			System.out.println(top);
		} else
		throw new Exception ("stack is full");
	}

	public int pop() throws Exception {
		if (!isEmpty()) {
			int temp = stack[top];
			top--;
			return temp;

		} else
			throw new Exception ("stack is Empty");

	}
	
	public int top() throws Exception {
		if (!isEmpty()) {
			
			return stack[top];

		} else
			throw new Exception ("stack is Empty");

	}


	
}
