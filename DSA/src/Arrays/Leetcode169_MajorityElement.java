package Arrays;

public class Leetcode169_MajorityElement {

	// Moores Voting Algorithm
	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));

	}
	
	public static int majorityElement(int[] nums) {
        int element=0;
        int cnt=0;
        for(int n:nums){
            if(cnt==0){
                cnt=1;
                element=n;
            }
            else if(element==n){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return element;
    }

}
