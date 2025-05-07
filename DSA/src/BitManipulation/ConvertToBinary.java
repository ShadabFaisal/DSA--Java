package BitManipulation;

public class ConvertToBinary {

	public static void main(String[] args) {
		int n=13;
		System.out.println(convertToBinary(n));

	}

	public static String convertToBinary(int n) {
		String res = "";
		while (n != 1) {
			if (n % 2 == 1) {
				res += '1';
			} else {
				res += '0';
			}
			n /= 2;
		}
		System.out.println(res);
		return reverse(res);
	}

	private static String reverse(String res) {
		char[] chars = res.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			// Swap characters at left and right pointers
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			// Move the pointers
			left++;
			right--;
		}

		return new String(chars);

	}

}
