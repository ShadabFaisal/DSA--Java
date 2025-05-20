package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Leetcode40_CombinationSumII {

	public static void main(String[] args) {
		int[] candidates = { 1, 1, 1, 2, 2 };
		int target = 5;
		System.out.println(combinationSum(candidates, target));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(candidates);
		solveII(0, candidates, target, ans, new ArrayList<>());
		return ans;
	}

	private static void solveII(int ind, int[] nums, int target, List<List<Integer>> ans, List<Integer> ds) {
		if (target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = ind; i < nums.length; i++) {
			if (i > ind && nums[i] == nums[i - 1])
				continue;
			if (nums[i] > target)
				break;
			ds.add(nums[i]);
			solveII(i + 1, nums, target - nums[i], ans, ds);
			ds.remove(ds.size() - 1);
		}

	}

	// Works in some cases
	private static void solveI(int ind, int[] nums, int target, Set<List<Integer>> ans, List<Integer> ds) {
		if (ind == nums.length) {
			if (target == 0) {
				Collections.sort(ds);
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if (nums[ind] <= target) {
			ds.add(nums[ind]);
			solveI(ind + 1, nums, target - nums[ind], ans, ds);
			ds.remove(ds.size() - 1);
		}
		solveI(ind + 1, nums, target, ans, ds);
	}

}
