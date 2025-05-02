package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54_SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(spiralOrder(matrix));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> spiral = new ArrayList<>();

		int m = matrix.length;
		int n = matrix[0].length;

		int top = 0, left = 0;
		int bottom = m - 1, right = n - 1;

		while (top <= bottom && left <= right) {
			// Right

			for (int i = left; i <= right; i++) {
				spiral.add(matrix[top][i]);
			}
			top++;

			// Bottom
			for (int i = top; i <= bottom; i++) {
				spiral.add(matrix[i][right]);
			}
			right--;
			if (top <= bottom) {
				// Left
				for (int i = right; i >= left; i--) {
					spiral.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				// Top
				for (int i = bottom; i >= top; i--) {
					spiral.add(matrix[i][left]);
				}
				left++;
			}
		}
		return spiral;
	}

}
