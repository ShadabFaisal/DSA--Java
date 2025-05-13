package Searching;

public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1= {2,3,45};
		int[] nums2= {4,6,7,8};
		int k=4;
		System.out.println(findKthElement(nums1, nums2,k));

	}
	public static int findKthElement(int[] nums1, int[] nums2, int k) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2)return findKthElement(nums2,nums1,k);
        int n=n1+n2;
        int low=Math.max(0, k-n2),high=Math.min(k, n1);
        int left=k;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;

            int l1=(mid1>0)?nums1[mid1-1]:Integer.MIN_VALUE;
            int l2=(mid2>0)?nums2[mid2-1]:Integer.MIN_VALUE;
            int r1=(mid1<n1)?nums1[mid1]:Integer.MAX_VALUE;
            int r2=(mid2<n2)?nums2[mid2]:Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                if(n%2==1)return Math.max(l1,l2);
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0;
    }

}
