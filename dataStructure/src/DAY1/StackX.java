package DAY1;

public class StackX {

	private int[] stack = new int[5];
	private int top = -1;

	// is empty
	public boolean isEmpty() {

		return top == -1;
	}

	// checking stack is full
	public boolean isFull() {
		return top == stack.length - 1;
	}

	// push
	public void push(int data) {
		if (!isFull()) {
			top = top + 1;
			stack[top] = data;
		} else {
			System.out.println("Stack is full!");
		}
	}

	// access top element
	public int top() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	public int pop() {
		return stack[top--];
	}

}
