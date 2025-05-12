package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560_SubarraySumEqualsK {

	public static void main(String[] args) {
		 int[] nums = {1,2,3};
		 int k = 3;
		 System.out.println(subarraySumOptimised(nums, k));

	}

	// Brute
	public static int subarraySum(int[] nums, int k) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int sum = 0;
				for (int l = i; l <= j; l++) {
					sum += nums[l];
				}
				if (sum == k) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	//Better
	public static int subarraySumBetter(int[] nums, int k) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	// Optimised Approach
	public static int subarraySumOptimised(int[] nums, int k) {
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int remaining=prefixSum-k;
            if(map.containsKey(prefixSum-k)){
                cnt+=map.get(remaining);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }

}
