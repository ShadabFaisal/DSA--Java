package Searching;

public class Leetcode1482_MinimumNoOfDaysToMakeMBouquets {

	public static void main(String[] args) {
		int[] bloomDay = {1,10,3,10,2};
		int m = 3, k = 1;
		
		System.out.println(minDays(bloomDay,m,k));

	}
	
	public static int minDays(int[] bloomDay, int m, int k) {
        long val=(long) m*k;
        int n=bloomDay.length;
        if(val>n){
            return -1;
        }
        
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int num:bloomDay){
            if(num<mini){
                mini=num;
            }
            if(num>maxi){
                maxi=num;
            }
        }

        int low=mini,high=maxi;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean possible(int[] arr, int day, int m, int k){
        int cnt=0;
        int noOfB=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);
        return noOfB>=m;
    }

}
