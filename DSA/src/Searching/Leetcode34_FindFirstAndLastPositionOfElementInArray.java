package Searching;

import java.util.Arrays;

public class Leetcode34_FindFirstAndLastPositionOfElementInArray {

	public static void main(String[] args) {
		int[] nums= {5,6,7,8,8,8,10};
		int target=8;
		
		System.out.println(Arrays.toString(searchRange(nums,target)));

	}

	public static int[] searchRange(int[] nums, int target) {

		int[] ans = new int[2];
		ans[0] = binarySearchFirst(nums, target);
		ans[1] = binarySearchLast(nums, target);

		return ans;
	}

	static int binarySearchFirst(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int first = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				first = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return first;
	}

	static int binarySearchLast(int[] nums, int target) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int last = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				last = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return last;
	}

}
