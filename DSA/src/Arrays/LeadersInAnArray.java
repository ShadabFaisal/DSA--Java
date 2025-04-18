package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 12, 3, 0, 6 };
		System.out.println(leaders(arr));

	}

	public static List<Integer> leaders(int[] arr) {
		int n = arr.length;
		int maxi = Integer.MIN_VALUE;
		List<Integer> ans = new ArrayList<>();
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > maxi) {
				ans.add(arr[i]);
			}
			maxi = Math.max(maxi, arr[i]);
		}
		return ans;
	}

}
