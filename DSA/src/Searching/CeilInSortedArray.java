package Searching;

public class CeilInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 100 };
		int k = 30;
		System.out.println(arr[findCeil(arr, arr.length, k)]);

	}

	public static int findCeil(int[] arr, int n, int x) {
		// Write your code here

		int ans = n;
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // 3
			if (arr[mid] >= x) {
				ans = mid;// 10
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return ans;
	}

}
