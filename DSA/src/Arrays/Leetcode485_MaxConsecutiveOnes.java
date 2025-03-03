package Arrays;

public class Leetcode485_MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));

	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int cnt=0;

        for(int num:nums){
            if(num==1){
                cnt++;
                maxi=Math.max(maxi,cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }

}
