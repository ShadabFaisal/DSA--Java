package Arrays;

public class Leetcode136_SingleNumber {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));

	}
	// Optimal Approach: Using XOR property a^a=0 || a^0=a
	public static int singleNumber(int[] nums) {
        int xor=0;

        for(int num:nums){
            xor^=num;
        }
        return xor;
    }

}
