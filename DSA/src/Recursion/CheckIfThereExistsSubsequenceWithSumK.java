package Recursion;

public class CheckIfThereExistsSubsequenceWithSumK {

	public static void main(String[] args) {
		int[] arr= {1,2,1};
		int n=3;
		int k=5;
		
		System.out.println(check(0,k,0 ,arr,n));
	}

	private static boolean check(int i, int k, int currSum, int[] arr, int n) {
		if(currSum==k) {
			return true;
		}
		if(i==n) {
			return false;
		}
		if(check(i+1,k,currSum+arr[i],arr,n)) {
			return true;
		}
		if(check(i+1,k,currSum,arr,n)) {
			return true;
		}
		return false;

	}

}
