package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequencesWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1 };
		int n = 3;
		int k = 2;

		List<Integer> res = new ArrayList<>();
		System.out.println(countSubsequencesWithSumK(0, res, k, 0, arr, n));
	}

	private static int countSubsequencesWithSumK(int i, List<Integer> res, int k, int sum, int[] arr, int n) {
		if (i == n) {
			if (sum == k) {
				return 1;
			}
			return 0;
		}
		res.add(arr[i]);
		sum += arr[i];
		int left = countSubsequencesWithSumK(i + 1, res, k, sum, arr, n);
		res.remove(res.size() - 1);
		sum -= arr[i];
		int right = countSubsequencesWithSumK(i + 1, res, k, sum, arr, n);

		return left + right;
	}

}
