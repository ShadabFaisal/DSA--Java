package StackAndQueues;

public class StackImplUsingArrays {

	int top = -1;
	int[] stack;
	int size = 10000;

	public StackImplUsingArrays() {
		stack = new int[size];
	}

	public void push(int val) {
		top++;
		stack[top] = val;
	}

	public int peek() {
		return stack[top];
	}

	public int pop() {
		int x = stack[top];
		top--;
		return x;
	}

	public int size() {
		return top + 1;
	}

	public static void main(String[] args) {
		StackImplUsingArrays st=new StackImplUsingArrays();
		st.push(1);
		st.push(15);
		st.push(8);
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.push(13);
		System.out.println(st.size());

	}

}
