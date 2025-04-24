package Strings;

public class Leetcode1781_SumOfBeautyOfAllSubstrings {

	public static void main(String[] args) {
		String s = "aabcb";
		System.out.println(beautySum(s));
	}
	
	 public static int beautySum(String s) {
	        int sum=0;
	        int n=s.length();
	        for(int i=0;i<n;i++){
	            int[] freq=new int[26];
	            for(int j=i;j<n;j++){
	                freq[s.charAt(j)-'a']++;
	                int beauty=getMaxCount(freq)-getMinCount(freq);
	                sum+=beauty;
	            }

	        }
	        return sum;
	    }
	
	public static int getMinCount(int[] freq){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                mini=Math.min(mini,freq[i]);
            }       
        }
        return mini;
    }
    public static int getMaxCount(int[] freq){
        int maxi=0;
        for(int i=0;i<26;i++){
            maxi=Math.max(maxi,freq[i]);
        }
        return maxi;
    }
   

}
