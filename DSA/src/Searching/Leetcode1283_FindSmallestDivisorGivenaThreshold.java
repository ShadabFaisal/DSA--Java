package Searching;

public class Leetcode1283_FindSmallestDivisorGivenaThreshold {

	public static void main(String[] args) {
		int[] nums = {1,2,5,9};
		int threshold = 6;
		System.out.println(smallestDivisor(nums,threshold));

	}
	
	 public static int smallestDivisor(int[] nums, int threshold) {
	        int maxi=0;
	        for(int n:nums){
	            maxi=Math.max(maxi,n);
	        }

	        int low=1,high=maxi;
	       int sum=0;
	       int ans=Integer.MAX_VALUE;
	       while(low<=high){
	           int mid=low+(high-low)/2;
	          sum=findSumOfDivisors(nums,mid);
	           if(sum<=threshold){
	               ans=mid;
	               high=mid-1;
	           }
	           else{
	               low=mid+1;
	           }
	       }
	       return ans;
	    }

	    public static int findSumOfDivisors(int[] nums, int hourly ){
	      int sum=0;
	      for(int i=0;i<nums.length;i++){
	       sum+=Math.ceil((double) nums[i]/ (double) hourly);
	      }
	       return sum;
	   }

}
