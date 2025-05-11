package StackAndQueues;

public class QueueImplUsingLinkedlist {
	
	ListNode start,end=null;
	int size=0;

	public void push(int val) {
		
		ListNode newNode=new ListNode(val);
		if(start==null) {
			start=end=newNode;
		}
		else {
			end.next=newNode;
			end=newNode;
		}
		size++;
	}

	public int peek() {
		return start.val;
	}

	public int pop() {
		ListNode temp=start;
		start=start.next;
		size--;
		return temp.val;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return start==null;
	}

	public static void main(String[] args) {
		QueueImplUsingLinkedlist q=new QueueImplUsingLinkedlist();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q.size());
		

	}

}
