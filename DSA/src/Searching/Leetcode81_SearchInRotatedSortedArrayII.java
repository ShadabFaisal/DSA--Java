package Searching;

public class Leetcode81_SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		int target = 0;
		
		System.out.println(search(nums, target));

	}
	
	public static boolean search(int[] nums, int target) {
        int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return true;
			}
			// Ex: [3,1,2,3,3,3,3]
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;high--;
                continue;
            }
			// Identify the sorted half
			// Left sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}
        }
        return false;
    }

}
