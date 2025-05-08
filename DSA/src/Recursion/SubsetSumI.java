package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumI {

	public static void main(String[] args) {
		int[] arr= {3,1,2};
		System.out.println(subsetSums(arr,arr.length));

	}
	public static List<Integer> subsetSums(int[] arr, int n){
		List<Integer> subsetSums=new ArrayList<>();
		helper(0,0,arr,n, subsetSums);
		Collections.sort(subsetSums);
		return subsetSums;
	}
	public static void helper(int i, int sum, int[] arr, int n, List<Integer> subsetSums) {
		if(i==n) {
			subsetSums.add(sum);
			return;
		}
		
		//Pick the element
		helper(i+1,sum+arr[i], arr,n, subsetSums);
		
		//Not pick the element
		helper(i+1,sum, arr, n, subsetSums);
	}

}
