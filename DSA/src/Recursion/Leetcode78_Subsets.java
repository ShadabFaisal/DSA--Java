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
	 public List<List<Integer>> subsetsUsingRecursion(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         helper(0,nums,nums.length,ans,new ArrayList<>());
         return ans;
    }

    public void helper(int i, int[] nums, int n, List<List<Integer>> ans, List<Integer> ds){
       if(i==n) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		//Pick the element
        ds.add(nums[i]);
		helper(i+1,nums,n,ans,ds);
		ds.remove(ds.size()-1);
		//Not pick the element
		helper(i+1,nums,n,ans,ds);
    }
    

}
