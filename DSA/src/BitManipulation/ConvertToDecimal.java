package BitManipulation;

public class ConvertToDecimal {

	public static void main(String[] args) {
		String x="1101";
		System.out.println(convertToDecimal(x));

	}
	
	public static int convertToDecimal(String x) {
		int len=x.length();
		int p2=1;int num=0;
		
		for(int i=len-1;i>=0;i--) {
			if(x.charAt(i)=='1') {
				num+=p2;
			}
			p2*=2;
		}
		return num;
	}

}
