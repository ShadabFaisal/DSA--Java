package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78_Subsets {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(subsets(nums));

	}

	// PowerSet
	public static List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		List<List<Integer>> ans = new ArrayList<>();
		int subsets = 1 << n;
		for (int num = 0; num < subsets; num++) {
			List<Integer> subList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if ((num & (1 << i)) != 0) {
					subList.add(nums[i]);
				}
			}
			ans.add(subList);
		}
		return ans;

	}

}
