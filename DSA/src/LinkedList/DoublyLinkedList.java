package LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,4,5,6,7};
		DLL_Node head=constructDLL(arr);
		printDLL(head);
		
		DLL_Node deletedHead=deleteHeadofDLL(head);
		printDLL(deletedHead);

	}
	
	private static void printDLL(DLL_Node head) {
		// TODO Auto-generated method stub
		DLL_Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
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

}
