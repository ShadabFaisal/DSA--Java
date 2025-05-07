package BitManipulation;

public class SetUnsetTheithBit {

	public static void main(String[] args) {
		int n=9; int i=2;
		System.out.println(setithBit(n, i));
		System.out.println(unsetithBit(13, i));

	}
	
	public static int setithBit(int n, int i) {
		return (n | (1<<i));
	}
	
	public static int unsetithBit(int n, int i) {
		return (n & (~(1<<i)));
	}

}
