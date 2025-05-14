package LinkedList;

public class Leetcode160_IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(4);

		head1 = head1.insertAtLast(head1, 1);
		head1 = head1.insertAtLast(head1, 8);
		head1 = head1.insertAtLast(head1, 4);
		head1 = head1.insertAtLast(head1, 5);

		ListNode head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(1);
		head2.next.next.next = head1.next.next;
		
		System.out.println(getIntersectionNode(head1,head2).val);

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode t1 = headA;
		ListNode t2 = headB;

		while (t1 != t2) {
			t1 = t1.next;
			t2 = t2.next;
			if (t1 == t2)
				return t1;
			if (t1 == null)
				t1 = headB;
			if (t2 == null)
				t2 = headA;
		}
		return t1;

	}

}
