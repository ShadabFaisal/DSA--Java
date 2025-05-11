package StackAndQueues;

public class StackImplUsingLinkedlist {

	ListNode top=null;
	int size=0;
	
	public void push(int val) {
		ListNode newNode=new ListNode(val);
		newNode.next=top;
		top=newNode;
		size++;
	}

	public int peek() {
		return top.val;
	}

	public int pop() {
		ListNode temp=top;
		top=top.next;
		size--;
		return temp.val;
	}

	public int size() {
		return size;
	}
	public static void main(String[] args) {
		StackImplUsingLinkedlist st=new StackImplUsingLinkedlist();
		st.push(14);
		st.push(13);
		st.push(12);
		st.push(11);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());

	}

}
