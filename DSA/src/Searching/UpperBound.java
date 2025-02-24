package Searching;

public class UpperBound {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 10, 11 };
		System.out.println(upperBound(arr, arr.length, 7));

	}

	public static int upperBound(int[] arr, int x, int n) {
		int ans = n;
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > x) {
				ans = mid;// 1
				high = mid - 1;// 0
			} else {
				low = mid + 1;
			}

		}

		return ans;
	}

}
