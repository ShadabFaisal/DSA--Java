package LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 6, 7 };
		DLL_Node head = constructDLL(arr);
		printDLL(head);

		head = deleteHeadofDLL(head);
		printDLL(head);

		head = deleteTailofDLL(head);
		printDLL(head);

		head = deleteKthNode(head, 3);
		printDLL(head);

		deleteNode(head.next);
		printDLL(head);

		head = insertBeforeHead(head, 11);
		printDLL(head);

		head = insertBeforeTail(head, 17);
		printDLL(head);
		
		head = insertBeforeKthElement(head, 99, 4);
		printDLL(head);

	}

	private static void printDLL(DLL_Node head) {
		// TODO Auto-generated method stub
		DLL_Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println();

	}

	private static DLL_Node constructDLL(int[] arr) {

		DLL_Node head = new DLL_Node(arr[0]);
		DLL_Node prev = head;

		for (int i = 1; i < arr.length; i++) {
			DLL_Node temp = new DLL_Node(arr[i]);
			temp.next = null;
			temp.back = prev;
			prev.next = temp;
			prev = temp;
		}

		return head;
	}

	private static DLL_Node deleteHeadofDLL(DLL_Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		DLL_Node prev = head;
		head = head.next;
		head.back = null;
		prev.next = null;

		return head;
	}

	private static DLL_Node deleteTailofDLL(DLL_Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		DLL_Node tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}
		DLL_Node prev = tail.back;
		prev.next = null;
		tail.back = null;

		return head;
	}

	private static DLL_Node deleteKthNode(DLL_Node head, int k) {

		DLL_Node temp = head;
		int cnt = 0;

		while (temp != null) {
			cnt++;
			if (cnt == k) {
				break;
			}
			temp = temp.next;
		}
		DLL_Node prev = temp.back;
		DLL_Node front = temp.next;

		if (prev == null && front == null) {
			return null;
		} else if (prev == null) {
			return deleteHeadofDLL(head);
		} else if (front == null) {
			return deleteTailofDLL(head);
		} else {
			prev.next = front;
			front.back = prev;
			temp.next = null;
			temp.back = null;
		}

		return head;

	}

	private static void deleteNode(DLL_Node temp) {
		DLL_Node prev = temp.back;
		DLL_Node front = temp.next;

		if (front == null) {
			prev.next = null;
			temp.back = null;
			return;
		}

		prev.next = front;
		front.back = prev;

		temp.next = temp.back = null;

	}

	private static DLL_Node insertBeforeHead(DLL_Node head, int val) {
		DLL_Node newHead = new DLL_Node(val);
		newHead.next = head;
		head.back = newHead;

		return newHead;
	}

	private static DLL_Node insertBeforeTail(DLL_Node head, int val) {

		if (head.next == null) {
			return insertBeforeHead(head, val);
		}
		DLL_Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		DLL_Node prev = tail.back;

		DLL_Node newNode = new DLL_Node(val);
		prev.next = newNode;
		newNode.back = prev;
		newNode.next = tail;
		tail.back = newNode;
		return head;

	}

	private static DLL_Node insertBeforeKthElement(DLL_Node head, int val, int k) {

		if(k==1) {
			return insertBeforeHead(head,val);
		}
		DLL_Node temp=head;
		int cnt=0;
		while(temp!=null) {
			cnt++;
			if(cnt==k)break;
			temp=temp.next;
		}
		DLL_Node prev=temp.back;
		DLL_Node newNode=new DLL_Node(val);
		newNode.next=temp;
		temp.back=newNode;
		prev.next=newNode;
		newNode.back=prev;
		
		return head;

	}
	
	private static void insertBeforeNode(DLL_Node node, int val) {
		
	}
}
