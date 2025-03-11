package Strings;

import java.util.Arrays;

public class Leetcode14_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"flower","flow","float"};
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);

        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
	
	
	public static String longestCommonPrefix2(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];//"flower"
        
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

}
