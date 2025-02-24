package Searching;

public class FloorInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
		int k = 5;
		System.out.println(arr[findFloor(arr, k)]);

	}

	static int findFloor(int[] arr, int k) {
		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] <= k) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
