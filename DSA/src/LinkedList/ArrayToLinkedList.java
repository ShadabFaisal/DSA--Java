package LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Node head = constructLL(arr);
		
//		printLinkedList(head);
//		findLengthOfLinkedList(head);
		
//		head = deleteHead(head);
//		printLinkedList(head);
//		findLengthOfLinkedList(head);
		
		head=deleteTail(head);
		printLinkedList(head);
		
	}

	public static void printLinkedList(Node head){
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(null+"");
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
		if (head == null || head.next==null)
			return null;
		Node temp=head;
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
	

}
