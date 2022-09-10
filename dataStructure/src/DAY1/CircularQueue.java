package DAY1;

public class CircularQueue {
	int first;
	int last;
	int count;
	int size;
	Integer[] queue;

	CircularQueue(int n) {
		last = -1;
		size = n;
		first = 0;
		queue = new Integer[size];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count >= size;
	}

	public void clear() {
		last = -1;
		first = -1;

	}

	public void enqueue(int ele) throws Exception {
		if (!isFull()) {
			last = (last + 1) % size;
			queue[last] = ele;
			count = count + 1;
		} else
			throw new Exception("queue is full");
	}

	public Integer dequeue() throws Exception {
		if (!isEmpty()) {

			int temp = queue[first];
			first = (first + 1) % size;

			count = count - 1;
			return temp;

		} else
			throw new Exception("queue is empty!");
	}

	public Integer firstEl() throws Exception {
		if (!isEmpty()) {
			Integer temp = queue[first];
			return temp;

		} else
			throw new Exception("queue is empty");
	}

	public void printqueue() {

		int temp = first;
		for (int i = 0; i < count; i++) {
			System.out.println(i + " Element = " + queue[temp]);
			temp = (temp + 1) % size;

		}
	}

	
		
	
}
