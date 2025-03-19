package LinkedList;

public class Leetcode2095_DeleteMiddleNodeOfLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		
		//Before deleting the middle node
		printLinkedList(head);
		
		head=deleteMiddle(head);
		
		// After deleting the middle node
		printLinkedList(head);

	}

	
	public static ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head.next.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
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
