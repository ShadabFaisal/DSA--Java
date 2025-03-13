package LinkedList;

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		DLL_Node head = new DLL_Node(1);
		DoublyLinkedList dl = new DoublyLinkedList();

		head = dl.insertBeforeHead(head, 2);
		head = dl.insertBeforeHead(head, 3);
		head = dl.insertBeforeHead(head, 4);
		head = dl.insertBeforeHead(head, 5);

		dl.printDLL(head);

		head = reverseDLL(head);
		dl.printDLL(head);

	}

	public static DLL_Node reverseDLL(DLL_Node head) {
		// Your code here
		if (head == null || head.next == null) {
			return head;
		}

		DLL_Node prev = null;
		DLL_Node curr = head;

		while (curr != null) {
			prev = curr.back;
			curr.back = curr.next;
			curr.next = prev;

			curr = curr.back;
		}

		return prev.back;
	}

}
