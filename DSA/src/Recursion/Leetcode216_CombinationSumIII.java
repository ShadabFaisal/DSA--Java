package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode216_CombinationSumIII {

	public static void main(String[] args) {
		int k = 3, target = 9;
		System.out.println(combinationSum3(k, target));
	}

	public static List<List<Integer>> combinationSum3(int k, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		solve(1, k, target, ans, new ArrayList<>());
		return ans;
	}

	private static void solve(int i, int k, int target, List<List<Integer>> ans, List<Integer> ds) {
		if (target == 0 && k == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}

		if (i > 9)
			return;
		if (target < 0 || k < 0)
			return;
		ds.add(i);
		solve(i + 1, k - 1, target - i, ans, ds);
		ds.remove(ds.size() - 1);
		solve(i + 1, k, target, ans, ds);

	}

}
