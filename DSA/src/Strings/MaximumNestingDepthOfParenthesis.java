package Strings;

public class MaximumNestingDepthOfParenthesis {

	public static void main(String[] args) {
		String  s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));

	}
	
	public static int maxDepth(String s) {
        int res=0, curr=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                curr++;
                res=Math.max(res,curr);
            }
            else if(ch==')'){
                curr--;
            }
        }
        return res;
    }

}
