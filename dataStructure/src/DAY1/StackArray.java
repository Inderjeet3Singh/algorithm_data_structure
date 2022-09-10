 package DAY1;

public class StackArray {
	private int top;
	private Character[] stack;

	StackArray(int n) {
		top = -1;
		int size = n;
		stack = new Character[size];

	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top >= stack.length - 1;
	}

	public void clear() {
		top = -1;
	}

	public void push(Character ele) throws Exception {
		if (!isFull()) {
			top++;
			stack[top] = ele;

		} else
			throw new Exception("stack is full");

	}

	public Character top() throws Exception {
		if (!isEmpty()) {
			return stack[top];
		} else
			throw new Exception("stack is empty");

	}

	public Character pop() throws Exception {
		if (!isEmpty()) {
			Character temp = stack[top];
			top--;
			return temp;
		} else
			throw new Exception(" stack is empty!");
	}

}
