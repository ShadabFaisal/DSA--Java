package LinkedList;

public class Leetcode876_MiddleOfTheLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		head = head.insertAtLast(head, 6);

		System.out.println(middleNode(head).val);

	}

	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
