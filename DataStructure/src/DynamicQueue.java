
public class DynamicQueue {

	public int maxSize;

	public int[] queue;
	private int bootom = 0;

	private int top;

	public DynamicQueue(int size) {
		this.maxSize = size;
		queue = new int[maxSize];
		top = -1;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			top++;
			queue[top] = value;
		} else {
			resize(maxSize * 2);
			enqueue(value);
		}
	}

	public int dequeue() {
		if (!isEmpty()) {
			return queue[bootom];
		}

		if (top < maxSize / 4) {
			resize(maxSize / 2);
			return dequeue();
		} else {
			System.out.println("The stack is already empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty())
			return queue[bootom];

		else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	private void resize(int newSize) {
		int[] transferArray = new int[newSize];

		for (int i = 0; i < queue.length; i++) {
			transferArray[i] = queue[i];
			queue = transferArray;
		}
		maxSize = newSize;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top + 1 == maxSize);
	}
	public void print() {
		for(int i = 0; i<queue.length; i++) {
			System.out.println(queue[i]);
		}

}}
