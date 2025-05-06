package LinkedList;

public class Leetcode328_OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);

		head = head.insertAtLast(head, 2);
		head = head.insertAtLast(head, 3);
		head = head.insertAtLast(head, 4);
		head = head.insertAtLast(head, 5);
		head = head.insertAtLast(head, 6);
		
		printLinkedList(head);
		
		head=oddEvenList(head);
		
		printLinkedList(head);
		

	}
	
	 public static ListNode oddEvenList(ListNode head) {
	        if(head==null || head.next==null){
	            return head;
	        }
	        ListNode odd=head;
	        ListNode even=head.next;
	        ListNode evenHead=head.next;

	        while(even!=null && even.next!=null){
	            odd.next=odd.next.next;
	            even.next=even.next.next;

	            odd=odd.next;
	            even=even.next;
	        }
	        odd.next=evenHead;
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
