package StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueue {

	Queue<Integer> q=null;
	
	public StackImplUsingQueue() {
		q=new LinkedList<>();
	}

	public void push(int x) {
		int size = q.size();
		q.add(x);

		for (int i = 0; i < size; i++) {
			q.add(q.poll());
		}
	}

	public int pop() {
		return q.poll();
	}

	public  int top() {
		return q.peek();
	}

	public boolean empty() {
		return q.size() == 0;
	}

	public static void main(String[] args) {
		StackImplUsingLinkedlist st=new StackImplUsingLinkedlist();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.size());

	}

}
