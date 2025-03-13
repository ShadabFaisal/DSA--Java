package LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,5,6,7};
		DLL_Node head=constructDLL(arr);
		printDLL(head);
		
		head=deleteHeadofDLL(head);
		printDLL(head);
		
		head=deleteTailofDLL(head);
		printDLL(head);
		
		head=deleteKthNode(head, 3);
		printDLL(head);

	}
	
	private static void printDLL(DLL_Node head) {
		// TODO Auto-generated method stub
		DLL_Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println();
		
	}

	private static DLL_Node constructDLL(int[] arr) {
		
		DLL_Node head=new DLL_Node(arr[0]);
		DLL_Node prev=head;
		
		for(int i=1;i<arr.length;i++) {
			DLL_Node temp=new DLL_Node(arr[i]);
			temp.next=null;
			temp.back=prev;
			prev.next=temp;
			prev=temp;
		}
	
		return head;
	}
	
	private static DLL_Node deleteHeadofDLL(DLL_Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		DLL_Node prev=head;
		head=head.next;
		head.back=null;
		prev.next=null;
		
		return head;
	}
	
	private static DLL_Node deleteTailofDLL(DLL_Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		DLL_Node tail=head;
		
		while(tail.next!=null) {
			tail=tail.next;
		}
		DLL_Node prev=tail.back;
		prev.next=null;
		tail.back=null;
		
		return head;
	}
	
	private static DLL_Node deleteKthNode(DLL_Node head, int k) {
		
		
		DLL_Node temp=head;
		int cnt=0;
		
		while(temp!=null) {
			cnt++;
			if(cnt==k) {
				break;
			}
			temp=temp.next;
		}
		DLL_Node prev=temp.back;
		DLL_Node front=temp.next;
		
		if(prev==null && front==null) {
			return null;
		}
		else if(prev==null) {
			return deleteHeadofDLL(head);
		}
		else if(front==null) {
			return deleteTailofDLL(head);
		}
		else {
			prev.next=front;
			front.back=prev;
			temp.next=null;
			temp.back=null;
		}
		
		return head;
		
	}

}
