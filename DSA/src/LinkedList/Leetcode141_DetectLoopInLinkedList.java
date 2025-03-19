package LinkedList;

public class Leetcode141_DetectLoopInLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		
		ListNode tail=head.findTailNode(head);
		tail.next=head.next.next;
		
		System.out.println(hasCycle(head));

	}
	
	public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

}
