package Searching;

public class Leetcode35_SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;

		System.out.println(searchInsert(nums, target));

	}

	public static int searchInsert(int[] arr, int target) {
		int ans = arr.length;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= target) {
				ans = mid;// 1
				high = mid - 1;// 0
			} else {
				low = mid + 1;
			}

		}

		return ans;
	}

}
