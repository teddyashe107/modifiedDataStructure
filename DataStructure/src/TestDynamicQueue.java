public class TestDynamicQueue {
	public static void main(String args[]) {
		DynamicQueue queue = new DynamicQueue(14);

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);

		queue.dequeue();

		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		queue.print();

	}
}
