package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 6};
		int k = 6;
		System.out.println("Array Element found at index: "+linearSearch(arr,k));

	}
	static int linearSearch(int arr[], int k) {
        // Your code here
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

}
