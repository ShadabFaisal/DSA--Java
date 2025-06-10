package Strings;

import java.util.HashMap;
import java.util.Map;

public class Leetcode3442_MaximumDifferenceBetweenOddAndEvenFrequencyI {

	public static void main(String[] args) {
		String s= "aaaaabbc";
		System.out.println(maxDifference(s));
	}
	 public static int maxDifference(String s) {
	        int oddMax=Integer.MIN_VALUE;
	        int evenMin=Integer.MAX_VALUE;

	        Map<Character, Integer> map=new HashMap<>();

	        for(char ch:s.toCharArray()){
	            map.put(ch, map.getOrDefault(ch,0)+1);
	        }

	        for(int count:map.values()){
	            if(count%2==1){
	                oddMax=Math.max(oddMax,count);
	            }
	            else{
	                evenMin=Math.min(evenMin,count);
	            }
	        }
	        return oddMax-evenMin;
	        
	    }

}
