package Searching;

public class CountOccurrencesOfAnElementInSortedArray {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int target = 2;
		System.out.println(countFreq(arr,target));

	}
	
	static int countFreq(int[] arr, int target) {
        // code here
        int first=firstOccurrence(arr,target);
        int last=lastOccurrence(arr,target);
        if(last!=-1 && first!=-1){
            return last-first+1;
        }
        return 0;
        
    }
    static int firstOccurrence(int[] nums, int target) {
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

	static int lastOccurrence(int[] nums, int target) {
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
