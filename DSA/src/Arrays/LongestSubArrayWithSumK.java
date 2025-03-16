package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int[] arr= {1,2,3,1,1,1,1,-2};
		int k=7;
		System.out.println(longestSubarrayPositives(arr, k));
		System.out.println(longestSubarray(arr, k));

	}

	// Optimal Approach for positives+negatives
	public static int longestSubarray(int[] arr, int k) {

		int n = arr.length;

		Map<Long, Integer> preSumMap = new HashMap<>();
		long sum = 0;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum == k) {
				maxLen = Math.max(maxLen, i + 1);
			}
			long rem = sum - k;

			if (preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}

			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}

		}
		return maxLen;
	}

	// Optimal Approach
	public static int longestSubarrayPositives(int[] arr, int k) {
		
		int n = arr.length;
		int left = 0;
		int right = 0;
		long sum = arr[0];
		int maxLen = 0;

		while (right < n) {
			while (left <= right && sum > k) {
				sum -= arr[left];
				left++;
			}
			if (sum == k) {
				maxLen = Math.max(maxLen, right - left + 1);
			}
			right++;
			if (right < n) {
				sum += arr[right];
			}
		}

		return maxLen;
	}

}
