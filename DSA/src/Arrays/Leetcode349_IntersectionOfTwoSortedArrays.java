package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode349_IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 }, b[] = { 1, 2, 3, 6, 7 };
		System.out.println(Arrays.toString(intersection(a, b)));
	}

	public static int[] intersection(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int n1 = a.length;
		int n2 = b.length;
		List<Integer> intersect = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < n1 && j < n2) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}
			if (a[i] < b[j]) {
				i++;
			} else if (b[j] < a[i]) {
				j++;
			} else {
				intersect.add(a[i]);
				i++;
				j++;
			}
		}

		int[] ans = new int[intersect.size()];
		int k = 0;
		for (int n : intersect) {
			ans[k++] = n;
		}
		return ans;

	}

}
