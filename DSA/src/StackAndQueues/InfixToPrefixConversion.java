package StackAndQueues;

import java.util.Stack;

public class InfixToPrefixConversion {

	public static void main(String[] args) {
		String exp = "(a+b)*(c-d)";
		System.out.println(infixToPrefix(exp));

	}

	public static String infixToPrefix(String exp) {
		String reversedInfix = reverse(exp, 0, exp.length() - 1);
		char[] infix = reversedInfix.toCharArray();
		for (int i = 0; i < infix.length; i++) {

			if (infix[i] == '(') {
				infix[i] = ')';
				i++;
			} else if (infix[i] == ')') {
				infix[i] = '(';
				i++;
			}
		}
		String prefix = infixToPostfix(new String(infix));
		return reverse(prefix, 0, prefix.length() - 1);
	}

	public static String infixToPostfix(String exp) {
		String infix = '(' + exp + ')';
		String ans = "";
		int i = 0;
		int len = infix.length();
		Stack<Character> op = new Stack<>();

		while (i < len) {
			char ch = infix.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				ans += ch;
			} else if (ch == '(') {
				op.push(ch);
			} else if (ch == ')') {
				while (!op.isEmpty() && op.peek() != '(') {
					ans += op.pop();
				}
				op.pop();
			} else {
				if (!Character.isLetterOrDigit(ch)) {
					while(prec(ch)<prec(op.peek()) || prec(ch)<=prec(op.peek()) && ch=='^'){
						ans+=op.pop();
					}
					op.push(ch);
				}
			}
			i++;
		}

		while (!op.isEmpty()) {
			if (op.peek() == '(')
				return "Invalid Expression";
			ans += op.pop();
		}

		return ans;
	}

	public static String reverse(String exp, int i, int j) {
		char[] chars = exp.toCharArray();
		char temp;
		while (i < j) {
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(chars);

	}

	private static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

}
