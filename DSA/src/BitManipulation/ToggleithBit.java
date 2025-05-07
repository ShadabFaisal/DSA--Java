package BitManipulation;

public class ToggleithBit {

	public static void main(String[] args) {
		int n=13; int i=1;
		System.out.println(toggleithBit(n, i));
	}
	
	public static int toggleithBit(int n, int i) {
		return (n ^ (1<<i));
	}
	

}
