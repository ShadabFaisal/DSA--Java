package Strings;

public class Leetcode8_StringToIntegerAtoi {

	public static void main(String[] args) {
		String s="-042";
		System.out.println(myAtoi(s));

	}

	public static int myAtoi(String s) {
		int len = s.length();
		if (len == 0) {
			return 0;
		}

		int index = 0;
		while (index < s.length() && s.charAt(index) == ' ') {
			index++;
		}
		if (index == len)
			return 0;
		boolean positive = s.charAt(index) == '+';
		boolean negative = s.charAt(index) == '-';

		if (positive || negative)
			index++;
		double num = 0;
		while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
			num = (num * 10) + s.charAt(index) - '0';
			index++;
		}

		num = negative ? -num : num;
		num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
		num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;

		return (int) num;

	}

}
