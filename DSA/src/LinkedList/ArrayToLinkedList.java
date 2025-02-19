package LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Node head = constructLL(arr);
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
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

}
