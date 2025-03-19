package LinkedList;

public class LengthOfLoopInLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 15);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		head = head.insertAtLast(head, 6);
		head = head.insertAtLast(head, 7);
		head = head.insertAtLast(head, 8);
		head = head.insertAtLast(head, 9);
		
		ListNode tail = head.findTailNode(head);
		tail.next = head.next.next;

		System.out.println(countNodesinLoop(head));

	}

	public static int countNodesinLoop(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return findLength(slow, fast);
			}
		}
		return 0;
	}

	public static int findLength(ListNode slow, ListNode fast) {
		int cnt = 1;
		fast = fast.next;
		while (slow != fast) {
			cnt++;
			fast = fast.next;
		}
		return cnt;
	}

}
