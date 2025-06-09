package Trie;

public class Leetcode440_KthSmallestInLexicographicalOrder {

	public static void main(String[] args) {
		int n = 25;
		int k = 13;
		System.out.println(findKthNumber(n, k));

	}

	public static int findKthNumber(int n, int k) {
		long curr = 1;
		k -= 1;
		while (k > 0) {
			long steps = getNoOfSteps(curr, n);
			if (steps <= k) {
				curr += 1;
				k -= steps;
			} else {
				curr *= 10;
				k -= 1;
			}
		}
		return (int) curr;

	}

	private static long getNoOfSteps(long curr, long n) {
		long next = curr + 1;
		long steps = 0;
		while (curr <= n) {
			if (next <= n) {
				steps += next - curr;
			} else {
				steps += (n - curr) + 1;
			}
			curr *= 10;
			next *= 10;
		}
		return steps;
	}

}
