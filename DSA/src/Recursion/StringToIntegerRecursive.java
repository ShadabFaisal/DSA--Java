package Recursion;

public class StringToIntegerRecursive {

	public static void main(String[] args) {
		String s="1234";
		System.out.println(myAtoi(s));

	}

	public static int myAtoi(String s) {

		if (s.length() == 1) {
			return s.charAt(0) - '0';
		}

		return 10*myAtoi(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1) - '0';

	}

}
