package LinkedList;

public class Add1ToNumberRepresentedasLL {

	public static void main(String[] args) {
		ListNode head = new ListNode(9);

		head = head.insertAtLast(head, 9);
		head = head.insertAtLast(head, 9);
		
		printLinkedList(head);
		
		head=addOne(head);
		
		printLinkedList(head);

	}
	
	public static ListNode addOne(ListNode head) {
		int carry=addOneHelper(head);
		if(carry==1) {
			ListNode newNode=new ListNode(1);
			newNode.next=head;
			head=newNode;
		}
		return head;
	}
	public static int addOneHelper(ListNode temp) {
		if(temp==null) {
			return 1;
		}
		int carry=addOneHelper(temp.next);
		temp.val+=carry;
		if(temp.val<10) {
			return 0;
		}
		temp.val=0;
		return 1;
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
