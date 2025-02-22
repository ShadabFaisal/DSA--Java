package Arrays;

import java.util.Arrays;

public class Leetcode283_MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes(int[] nums) {

		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1) {
			return;
		}

		for (int i = j + 1; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums, i, j);
				j++;
			}
		}

	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
