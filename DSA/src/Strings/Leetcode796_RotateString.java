package Strings;

public class Leetcode796_RotateString {

	public static void main(String[] args) {
		String s = "abcde", goal = "deabc";
		System.out.println(rotateString(s, goal));

	}

	public static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length())
			return false;

		return (s + s).contains(goal);
	}

}
