package Strings;

public class Leetcode5_LongestPalindromicSubstrings {

	public static void main(String[] args) {
		String s = "barbabrw";
		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {
		int start = 0;
		int maxLen = 1;
		int l = s.length();

		for (int i = 1; i < l; i++) {

			int left = i - 1;
			int right = i;

			while (left >= 0 && right < l && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > maxLen) {
					maxLen = right - left + 1;
					start = left;
				}
				left--;
				right++;
			}

			left = i - 1;
			right = i + 1;

			while (left >= 0 && right < l && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > maxLen) {
					maxLen = right - left + 1;
					start = left;
				}
				left--;
				right++;
			}
		}
		return s.substring(start, start + maxLen);
	}

}
