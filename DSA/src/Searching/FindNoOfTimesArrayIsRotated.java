package Searching;

public class FindNoOfTimesArrayIsRotated {

	public static void main(String[] args) {
		int []arr = {4, 5, 1, 2, 3};
		System.out.println(findNoOfRotation(arr));

	}

	public static int findNoOfRotation(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[low] <= arr[high]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}

				break;
			}

			// Identify the sorted half
			// If Left is sorted pick the minimum i.e. nums[low]
			if (arr[low] <= arr[mid]) {
				if (arr[low] < ans) {
					index = low;
					ans = arr[low];
				}
				low = mid + 1;
			} else {
				if (arr[mid] < ans) {
					index = mid;
					ans = arr[mid];
				}
				high = mid - 1;
			}

		}
		return index;
	}

}
