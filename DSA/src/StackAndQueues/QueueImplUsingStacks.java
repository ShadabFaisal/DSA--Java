package StackAndQueues;

import java.util.Stack;

public class QueueImplUsingStacks {

	Stack<Integer> s1, s2;

	public QueueImplUsingStacks() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

	public void push(int x) {
		s1.push(x);
	}

	public int pop() {

		if (!s2.isEmpty()) {
			return s2.pop();
		} 
		else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}

	public int peek() {
		if (!s2.isEmpty()) {
			return s2.peek();
		} else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			return s2.peek();
		}
	}

	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}

	public static void main(String[] args) {
		QueueImplUsingStacks q = new QueueImplUsingStacks();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);

		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q.empty());

	}

}
