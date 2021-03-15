
public class TestDoublyLinkedList {
	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		// add to the head
		list.addToHead(1);
		list.addToHead(2);
		list.addToHead(3);
		list.addToHead(4);
		list.addToHead(5);
		list.addToHead(6);

		// adding to the tail
		list.addToTail(7);
		list.addToTail(8);
		list.addToTail(9);
		list.addToTail(10);

		list.insertAtPos(11, 8);

		list.deleteAtPos(3);

		System.out.println("Empty status = " + list.isEmpty());

		System.out.println("Size = " + list.getSize() + " \n");
		
		list.display();

	}

}
