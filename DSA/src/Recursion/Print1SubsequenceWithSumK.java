package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Print1SubsequenceWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		int n=3;
		int k=2;
		
		List<Integer> res=new ArrayList<>();
		printSubsequencesWithSumK(0,res, k, 0, arr,n);
	}

	private static boolean printSubsequencesWithSumK(int i, List<Integer> res, int k, int sum, int[] arr, int n) {
		if(i==n) {
			if(sum==k) {
				System.out.println(res);
				return true;
			}
			return false;
		}
		res.add(arr[i]);
		sum+=arr[i];
		if(printSubsequencesWithSumK(i+1, res, k, sum, arr, n)) {
			return true;
		}
		res.remove(res.size()-1);
		sum-=arr[i];
		if(printSubsequencesWithSumK(i+1, res, k, sum, arr, n)) {
			return true;
		}
		return false;
	}
}
