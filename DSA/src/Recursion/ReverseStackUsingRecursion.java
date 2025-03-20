package Recursion;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s);
		reverse(s);
		System.out.println(s);

	}
	
	static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size()==1){
            return;
        }
        int temp=s.pop();
        reverse(s);
        insert(s,temp);
        return;
    }
    
    static void insert(Stack<Integer> s, int ele){
        if(s.size()==0){
            s.push(ele);
            return;
        }
        int val=s.pop();
        insert(s,ele);
        s.push(val);
        return;
    }

}
