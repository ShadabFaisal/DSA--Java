package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode39_CombinationSumI {

	public static void main(String[] args) {
		int[] candidates= {2,3,6,7};
		int target=7;
		System.out.println(combinationSum(candidates,target));

	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void solve(int ind, int[] nums, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[ind]<=target){
            ds.add(nums[ind]);
            solve(ind,nums,target-nums[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        solve(ind+1,nums,target,ans,ds);
    }

}
