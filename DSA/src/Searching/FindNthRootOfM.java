package Searching;

public class FindNthRootOfM {

	public static void main(String[] args) {
		int m=343,n=3;
		System.out.println(nthRoot(m,n));

	}
	public static int nthRoot(int m, int n) {
        long low=1;
        long high=m;
        long ans=1;

        while(low<=high){
            long mid=(low+high)/2;
            if((Math.pow(mid, n))==m){
                return (int)mid;
            }
            else if((Math.pow(mid, n))<m) {
            	low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }


}
