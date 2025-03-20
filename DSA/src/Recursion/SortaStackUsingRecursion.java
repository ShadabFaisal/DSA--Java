package Recursion;

import java.util.Stack;

public class SortaStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(3);
		s.push(13);
		s.push(2);

		System.out.println(sort(s));

	}

	public static Stack<Integer> sort(Stack<Integer> s) {
		helper(s);
		return s;
	}

	public static void helper(Stack<Integer> s) {
		if (s.size() == 1) {
			return;
		}
		int temp = s.pop();
		helper(s);
		insert(s, temp);
		return;
	}

	public static void insert(Stack<Integer> s, int temp) {
		if (s.size() == 0 || s.peek() <= temp) {
			s.push(temp);
			return;
		}
		int val = s.pop();
		insert(s, temp);
		s.push(val);
		return;
	}

}
