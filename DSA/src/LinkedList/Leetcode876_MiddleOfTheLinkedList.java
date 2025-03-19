package LinkedList;

public class Leetcode876_MiddleOfTheLinkedList {

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head=insertAtLast(head,2);
		head=insertAtLast(head,3);
		head=insertAtLast(head,4);
		head=insertAtLast(head,5);
		head=insertAtLast(head,6);
		
		System.out.println(middleNode(head).val);

	}
	
	public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
	
	public static ListNode insertAtLast(ListNode head, int value) {
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

}
