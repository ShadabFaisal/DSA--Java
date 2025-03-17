package Searching;

public class Leetcode153_FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 0, 1, 2 };
		System.out.println(findMin(nums));

	}

	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int ans = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if(nums[low]<=nums[high]) {
				ans = Math.min(ans, nums[low]);
				break;
			}

			// Identify the sorted half
			// If Left is sorted pick the minimum i.e. nums[low]
			if (nums[low] <= nums[mid]) {
				ans = Math.min(ans, nums[low]);
				low = mid + 1;
			} else {
				ans = Math.min(ans, nums[mid]);
				high = mid - 1;
			}

		}
		return ans;
	}

}
