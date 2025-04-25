package Strings;

public class CountNoOfStrings {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(countSubstrings(s));

	}
	
	public static int countSubstrings(String s) {
		int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               count++;
            }
        }
        return count;
    }

}
