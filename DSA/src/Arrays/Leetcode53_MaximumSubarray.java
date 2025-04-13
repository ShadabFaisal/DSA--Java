package Arrays;

public class Leetcode53_MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}
	// Kadane's Algorithm

	public static int maxSubArray(int[] nums) {
		int maxi = Integer.MIN_VALUE;
		int sum = 0;

		for (int num : nums) {
			sum += num;
			maxi = Math.max(maxi, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxi;
	}
}
