package Strings;

public class Leetcode151_ReverseWordsInaString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].isBlank())
                sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }

}
