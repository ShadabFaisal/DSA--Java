package Strings;

public class Leetcode242_ValidAnagram {

	public static void main(String[] args) {
		 String s = "anagram", t = "nagarama";
		 System.out.println(isAnagram(s,t));

	}

	public static boolean isAnagram(String s, String t) {
		s = s.toLowerCase().replace(" ", "");
		t = t.toLowerCase().replace(" ", "");

		if (s.length() != t.length()) {
			return false;
		}

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			freq[t.charAt(i) - 'a']--;
		}

		for (int count : freq) {
			if (count != 0) {
				return false;
			}
		}
		return true;

	}

}
