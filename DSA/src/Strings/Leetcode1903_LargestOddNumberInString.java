package Strings;

public class Leetcode1903_LargestOddNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "354798";
		System.out.println(largestOddNumber(num));
	}

	public static String largestOddNumber(String num) {
		int len = num.length();

		if ((num.charAt(len - 1) - '0') % 2 == 1) {
			return num;
		}
		int i = len - 2;
		while (i >= 0) {
			int n = num.charAt(i);
			if (n % 2 == 1) {
				return num.substring(0, i + 1);
			}
			i--;
		}
		return "";
	}

}
