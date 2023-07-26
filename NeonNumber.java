public class NeonNumber {
	public static boolean isNeon(int n) {
		int sum=0; int square=n*n;
		while(square!=0) {
			int lastdigit=square%10;
			sum=sum+lastdigit;
			square=square/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isNeon(9));
	}
}
