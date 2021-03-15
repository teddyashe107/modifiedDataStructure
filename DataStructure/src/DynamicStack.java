public class DynamicStack {

	private int maxSize;

	private int[] stackArray;

	private int top;

	public DynamicStack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (!isFull()) {
			top++;
			stackArray[top] = value;
		} else {
			resize(maxSize * 2);
			push(value);
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return stackArray[top--];
		}

		if (top < maxSize / 4) {
			resize(maxSize / 2);
			return pop();
		} else {
			System.out.println("The stack is already empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty())
			return stackArray[top];

		else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	private void resize(int newSize) {
		int[] transferArray = new int[newSize];

		for (int i = 0; i < stackArray.length; i++) {
			transferArray[i] = stackArray[i];
			stackArray = transferArray;
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
		for(int i = 0; i<stackArray.length; i++) {
			System.out.println(stackArray[i]);
		}

	
	  }}

