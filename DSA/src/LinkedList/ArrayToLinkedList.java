package LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5,6 };
		Node head = constructLL(arr);

//		printLinkedList(head);
//		findLengthOfLinkedList(head);

//		head = deleteHead(head);
//		printLinkedList(head);
//		findLengthOfLinkedList(head);

//		head=deleteTail(head);
//		printLinkedList(head);

//		head=deleteKthNode(head,1);
//		printLinkedList(head);
//		
//		head = deleteNodewithValue(head, 6);
//		printLinkedList(head);

//		head = insertAtHead(head, 7);
//		printLinkedList(head);
//
//		head = insertAtLast(head, 100);
//		printLinkedList(head);

//		head = insertAtKthPosition(head, 1, 7);
//		printLinkedList(head);
		
		head = insertElementBeforeX(head, 2, 7);
		printLinkedList(head);

	}

	public static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(null + "");
		System.out.println();
	}

	public static void findLengthOfLinkedList(Node head) {
		int length = 0;
		while (head != null) {
			head = head.next;
			length++;
		}
		System.out.println("Length of LinkedList: " + length);
	}

	public static Node constructLL(int arr[]) {
		// code here
		Node head = new Node();
		Node dummy = head;
		for (int i = 0; i < arr.length; i++) {
			Node node = new Node(arr[i]);
			dummy.next = node;
			dummy = dummy.next;
		}
		dummy.next = null;
		return head.next;
	}

	public static Node deleteHead(Node head) {
		if (head == null)
			return head;
		return head.next;
	}

	public static Node deleteTail(Node head) {
		if (head == null || head.next == null)
			return null;
		Node temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	public static Node deleteKthNode(Node head, int k) {
		if (head == null)
			return head;

		if (k == 1) {
			return head.next;
		}

		int cnt = 0;
		Node temp = head;
		Node prev = null;

		while (temp != null) {
			cnt++;

			if (cnt == k) {
				prev.next = prev.next.next;
			}
			prev = temp;
			temp = temp.next;
		}

		return head;
	}

	public static Node deleteNodewithValue(Node head, int val) {
		if (head == null)
			return head;

		if (head.data == val) {
			return head.next;
		}

		Node temp = head;
		Node prev = null;

		while (temp != null) {

			if (temp.data == val) {
				prev.next = prev.next.next;
			}
			prev = temp;
			temp = temp.next;
		}

		return head;
	}

	public static Node insertAtHead(Node head, int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		return newNode;
	}

	public static Node insertAtLast(Node head, int value) {
		if (head == null) {
			return new Node(value);
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(value);
		temp.next = newNode;
		return head;
	}

	public static Node insertAtKthPosition(Node head, int k, int value) {
		if (head == null) {
			if(k==1) {
				return new Node(value);
			}
		}

		if (k == 1) {
			Node newNode = new Node(value);
			newNode.next = head;
			return newNode;
		}

		Node temp = head;
		int cnt = 0;

		while (temp != null) {
			cnt++;
			if (cnt == k - 1) {
				Node newNode = new Node(value);
				newNode.next = temp.next;
				temp.next = newNode;
			}
			temp = temp.next;
		}

		return head;
	}
	
	public static Node insertElementBeforeX(Node head, int x, int value) {
		if (head == null) {
			return null;
		}

		if (head.data == x) {
			Node newNode = new Node(value);
			newNode.next = head;
			return newNode;
		}

		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data==x) {
				Node newNode = new Node(value);
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}

		return head;
	}

}
