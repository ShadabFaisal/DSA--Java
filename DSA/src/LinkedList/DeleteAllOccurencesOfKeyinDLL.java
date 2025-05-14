package LinkedList;

public class DeleteAllOccurencesOfKeyinDLL {

	public static void main(String[] args) {
		DLL_Node head = new DLL_Node(10);
		head.next = new DLL_Node(4);
		head.next.back = head;
		head.next.next = new DLL_Node(10);
		head.next.next.back = head.next;
		head.next.next.next = new DLL_Node(10);
		head.next.next.next.back = head.next.next;
		head.next.next.next.next = new DLL_Node(6);
		head.next.next.next.back = head.next.next.next;
		
		int key=10;

		printDLL(head);
		
		head=deleteAllOccurences(head,key);
		
		printDLL(head);

	}

	public static DLL_Node deleteAllOccurences(DLL_Node head, int key) {
		DLL_Node temp = head;
		DLL_Node nextNode, prevNode = null;
		while (temp != null) {
			if (temp.data == key) {
				if (temp == head) {
					head = head.next;
				}
				nextNode = temp.next;
				prevNode = temp.back;
				if (nextNode != null)
					nextNode.back = prevNode;
				if (prevNode != null)
					prevNode.next = nextNode;
				temp = nextNode;

			}
			else {
				temp=temp.next;
			}
		}

		return head;
	}

	public static void printDLL(DLL_Node head) {
		// TODO Auto-generated method stub
		DLL_Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println("null");

	}

}
