package LinkedList;

public class Leetcode148_SortaLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 9);
		head = head.insertAtLast(head, 7);
		head = head.insertAtLast(head, 5);
		head = head.insertAtLast(head, 2);

		printLinkedList(head);

		
		head=sortList(head);
		
		printLinkedList(head);
		
	}

	public static ListNode mergeTwoLinkedList(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				temp.next = list1;
				temp = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				temp = list2;
				list2 = list2.next;
			}
		}

		while (list1 != null) {
			temp.next = list1;
			temp = list1;
			list1 = list1.next;
		}

		while (list2 != null) {
			temp.next = list2;
			temp = list2;
			list2 = list2.next;
		}
		return dummy.next;
	}

	public static ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode middleNode = findMiddle(head);
		ListNode leftHead = head, rightHead = middleNode.next;
		middleNode.next = null;

		leftHead = sortList(leftHead);
		rightHead = sortList(rightHead);

		return mergeTwoLinkedList(leftHead, rightHead);
	}

	public static ListNode findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
