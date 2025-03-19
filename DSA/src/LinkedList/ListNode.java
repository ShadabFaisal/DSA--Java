package LinkedList;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	
	public ListNode insertAtLast(ListNode head, int value) {
		if (head == null) {
			return new ListNode(value);
		}

		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		ListNode newNode = new ListNode(value);
		temp.next = newNode;
		return head;
	}
	public ListNode findTailNode(ListNode head) {
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp;
	}
	
	
}