package Searching;

public class Leetcode69_FindSqrtOfNumber {

	public static void main(String[] args) {
		int x=28;
		System.out.println(mySqrt(x));

	}
	
	public static int mySqrt(int x) {
        long low=1;
        long high=x;
        long ans=1;

        while(low<=high){
            long mid=(low+high)/2;
            if((mid*mid)<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }

}
