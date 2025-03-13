package LinkedList;

public class DLL_Node {
	int data;
	DLL_Node next;
	DLL_Node back;

	DLL_Node(int data, DLL_Node next1, DLL_Node back1) {
		data = data;
		next=next1;
		back=back1;
	}

	DLL_Node(int d) {
		data = d;
		next=null;
		back=null;
	} // constructor to create a new node
}
