package Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3, 6, 7};
		System.out.println(findUnion(a,b));

	}
	
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
		int n1 = a.length;
		int n2 = b.length;
		ArrayList<Integer> union = new ArrayList<>();
		int i = 0;
		int j = 0;
        
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n1){
             if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
        }
        while(j<n2){
             if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
            }   
                j++;
        }
        
        return union;
        
    }

}
