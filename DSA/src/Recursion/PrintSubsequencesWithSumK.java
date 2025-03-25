package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		int n=3;
		int k=2;
		
		List<Integer> res=new ArrayList<>();
		printSubsequencesWithSumK(0,res, k, 0, arr,n);
	}

	private static void printSubsequencesWithSumK(int i, List<Integer> res, int k, int sum, int[] arr, int n) {
		if(i==n) {
			if(sum==k) {
				System.out.println(res);
			}
			return;
		}
		res.add(arr[i]);
		sum+=arr[i];
		printSubsequencesWithSumK(i+1, res, k, sum, arr, n);
		res.remove(res.size()-1);
		sum-=arr[i];
		printSubsequencesWithSumK(i+1, res, k, sum, arr, n);
	}

}
