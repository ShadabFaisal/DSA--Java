package LinkedList;

public class SortLLof0s1s2s {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 0);
		head = head.insertAtLast(head, 1);
		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 0);
		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 1);

		printLinkedList(head);

		head = sortLL(head);

		printLinkedList(head);

	}

	public static ListNode sortLL(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode zeroHead = new ListNode(-1);
		ListNode zero = zeroHead;
		ListNode oneHead = new ListNode(-1);
		ListNode one = oneHead;
		ListNode twoHead = new ListNode(-1);
		ListNode two = twoHead;

		ListNode temp = head;

		while (temp != null) {
			if (temp.val == 0) {
				zero.next = temp;
				zero = temp;
			} else if (temp.val == 1) {
				one.next = temp;
				one = temp;
			} else {
				two.next = temp;
				two = temp;
			}
			temp = temp.next;
		}

		zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;

		one.next = twoHead.next;
		two.next = null;

		return zeroHead.next;
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
