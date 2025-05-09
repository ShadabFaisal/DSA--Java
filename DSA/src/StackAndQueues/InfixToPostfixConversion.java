package StackAndQueues;

import java.util.Stack;

public class InfixToPostfixConversion {

	public static void main(String[] args) {
		String exp="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp));
		//abcd^e-fgh*+^*+i-
		//abcd^e-fgh*+^*+i-
	}
	
	public static String infixToPostfix(String exp) {
		String ans="";
		int i=0;
		int len=exp.length();
		Stack<Character> op=new Stack<>();
		
		while(i<len) {
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				ans+=ch;
			}
			else if(ch=='(') {
				op.push(ch);
			}
			else if(ch==')') {
				while(!op.isEmpty() && op.peek()!='(') {
					ans+=op.pop();
				}
				op.pop();
			}
			else {
				while(!op.isEmpty() && prec(ch) <= prec(op.peek())) {
					ans+=op.pop();
				}
				op.push(ch);
			}
			i++;
		}
		
		while(!op.isEmpty()) {
			if (op.peek() == '(')
		        return "Invalid Expression";
			ans+=op.pop();
		}
		
		return ans;
	}

	private static int prec(char ch) {
		switch(ch) {
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
