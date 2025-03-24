package LinkedList;

public class Leetcode206_ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		head = head.insertAtLast(head, 6);

		printLinkedList(head);

		head = reverseListUsingRecursion(head);

		printLinkedList(head);

	}

	// Iterative
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null)
				next = next.next;
		}
		return prev;
	}

	// Recursive
	public static ListNode reverseListUsingRecursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		ListNode front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
	}

	public static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.print(null + "");
		System.out.println();
	}

}
