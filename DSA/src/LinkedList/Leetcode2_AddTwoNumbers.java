package LinkedList;

public class Leetcode2_AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		l1 = l1.insertAtLast(l1, 9);
		l1 = l1.insertAtLast(l1, 9);
		
		ListNode l2 = new ListNode(9);
		l2 = l2.insertAtLast(l2, 9);
		l2 = l2.insertAtLast(l2, 9);
		
		printLinkedList(l1);
		printLinkedList(l2);
		
		ListNode ans=addTwoNumbers(l1, l2);
		
		System.out.println("After addition....");
		printLinkedList(ans);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode t1 = l1;
		ListNode t2 = l2;
		ListNode dummyNode = new ListNode(-1);
		ListNode curr = dummyNode;
		int carry = 0;

		while (t1 != null || t2 != null) {
			int sum = carry;
			if (t1 != null)
				sum += t1.val;
			if (t2 != null)
				sum += t2.val;
			ListNode newNode = new ListNode(sum % 10);
			carry = sum / 10;
			curr.next = newNode;
			curr = newNode;
			if (t1 != null)
				t1 = t1.next;
			if (t2 != null)
				t2 = t2.next;
		}
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			curr.next = newNode;
			curr = newNode;
		}
		return dummyNode.next;
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
