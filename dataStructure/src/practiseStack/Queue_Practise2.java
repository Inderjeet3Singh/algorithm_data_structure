package practiseStack;

public class Queue_Practise2 {
	private int first;
	private int end;
	private int count;
	private int size;
	private Integer[] quue;

	public Queue_Practise2(int n) {
		first = 0;
		end = -1;
		count = 0;
		size = n;
		quue = new Integer[size];
	}

	public boolean isEmpty() {

		return count == 0;
	}

	public boolean isFull() {

		return count >= size;
	}

	public void enqueue(int n) throws Exception {

		if (!isFull()) {
			end = (end + 1) % size;
			quue[end] = n;
			count = count + 1;
		} else
			throw new Exception("queue is full");
	}

	public Integer dequeue() throws Exception {
		if (!isEmpty()) {

			int temp = quue[first];
			first = (first + 1) % size;
			System.out.println(temp + " : is removed");
			count = count - 1;
			return temp;

		} else
			throw new Exception("queue is empty");

	}

	public Integer firstEl() throws Exception {
		if (!isEmpty()) {

			Integer temp = quue[first];
			return temp;

		} else
			throw new Exception("queue is empty");

	}

	public void printAll() {
		if (!isEmpty()) {
			int temp = first;
			for (int i = 0; i < count; i++) {
				System.out.println(quue[temp]);
				temp = (temp + 1) % size;

			}
		}

	}
}