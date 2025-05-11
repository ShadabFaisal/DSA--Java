package StackAndQueues;

public class QueueImplUsingArrays {

	int size = 10000;
	int[] queue;
	int currSize = 0;

	int front = -1, rear = -1;

	public QueueImplUsingArrays() {
		queue = new int[size];
	}

	public void push(int val) {
		if (currSize == 0) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		queue[rear] = val;
		currSize += 1;
	}

	public int peek() {
		return queue[front];
	}

	public int pop() {
		int element = queue[front];
		if (currSize == 1) {
			front = rear = -1;
		} else {
			front = (front + 1) % size;
		}
		currSize -= 1;
		return element;
	}

	public int size() {
		return currSize;
	}

	public static void main(String[] args) {
		QueueImplUsingArrays q=new QueueImplUsingArrays();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q.size());

	}

}
