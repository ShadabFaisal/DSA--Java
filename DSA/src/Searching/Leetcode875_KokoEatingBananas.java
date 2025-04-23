package Searching;

public class Leetcode875_KokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = {3,6,7,11};int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}
	
	public static int minEatingSpeed(int[] piles, int h) {
       int max=0;
       for(int pile:piles){
           max=Math.max(max,pile);
       }
       int low=1,high=max;
       int totalHrs=0;
       int ans=Integer.MAX_VALUE;
       while(low<=high){
           int mid=low+(high-low)/2;
           totalHrs=hourlyBananas(piles,mid);
           if(totalHrs<=h){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return ans;
   }

   public static int hourlyBananas(int[] piles, int hourly ){
      int totalHrs=0;
      for(int i=0;i<piles.length;i++){
       totalHrs+=Math.ceil((double) piles[i]/ (double) hourly);
      }
       return totalHrs;
   }

}
