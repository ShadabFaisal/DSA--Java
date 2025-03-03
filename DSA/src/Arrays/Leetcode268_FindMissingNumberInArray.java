package Arrays;

public class Leetcode268_FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumberSol1(nums));
		System.out.println(missingNumberSol2(nums));
	}

	// Optimal 1
	public static int missingNumberSol1(int[] nums) {
		int n = nums.length;
		double sum = (n * (n + 1)) / 2;
		double s2 = 0;
		for (int num : nums) {
			s2 += num;
		}
		return (int) (sum - s2);
	}
	
	// Optimal 2
	
	public static int missingNumberSol2(int[] nums) {
        int n=nums.length;
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            xor2^=nums[i];
            xor1^=(i+1);
        }
        return xor2^xor1;
    }

}
