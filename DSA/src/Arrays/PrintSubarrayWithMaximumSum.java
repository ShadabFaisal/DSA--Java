package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintSubarrayWithMaximumSum {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		printMaxSubArray(nums);

	}

	// Kadane's Algorithm

	public static void printMaxSubArray(int[] nums) {
		int maxi = Integer.MIN_VALUE;
		int n = nums.length;
		int sum = 0;
		int start = 0;
		int ansStart = -1;
		int ansEnd = -1;

		for (int i = 0; i < n; i++) {
			if (sum == 0)
				start = i;
			sum += nums[i];
			if (sum > maxi) {
				maxi = sum;
				ansStart = start;
				ansEnd = i;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		List<Integer> ans = new ArrayList<>();
		for (int i = ansStart; i <= ansEnd; i++) {
			ans.add(nums[i]);
		}
		System.out.println(ans);

	}
}
