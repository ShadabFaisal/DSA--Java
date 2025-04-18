package Arrays;

import java.util.Arrays;

public class Leetcode2149_RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		System.out.println(Arrays.toString(rearrangeArray(nums)));

	}

	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];

		int posIndex = 0, negIndex = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] < 0) {
				ans[negIndex] = nums[i];
				negIndex += 2;
			} else {
				ans[posIndex] = nums[i];
				posIndex += 2;
			}
		}
		return ans;
	}

	// Variety 2

}
