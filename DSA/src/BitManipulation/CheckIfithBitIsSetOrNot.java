package BitManipulation;

public class CheckIfithBitIsSetOrNot {

	public static void main(String[] args) {
		int n=6; int i=1;
		System.out.println(checkIthBit(n, i));
		System.out.println(checkIthBitRightShift(n, i));
	}
	
	//Using left shift operator
	public static boolean checkIthBit(int n, int i) {
		if((n & (1<<i))!=0) {
			return true;
		}
		return false;
	}
	
	//Using left shift operator
		public static boolean checkIthBitRightShift(int n, int i) {
			if(((n>>i) & 1)==1 ) {
				return true;
			}
			return false;
		}

}
