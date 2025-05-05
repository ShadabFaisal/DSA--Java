package Searching;

public class Leetcode1011_CapacityToShipPackagesWithinDdays {

	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10}; 
		int days = 5;
		System.out.println(shipWithinDays(weights, days));

	}
	
	public static int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int weight:weights){
            maxi=Math.max(maxi,weight);
            sum+=weight;
        }

        int low=maxi,high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int noOfDays=findDays(weights, mid);
            if(noOfDays<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int findDays(int[] weights, int cap){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }

}
