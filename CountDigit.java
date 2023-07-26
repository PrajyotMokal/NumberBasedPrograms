import java.util.Scanner;

public class CountDigit {
	public int countDigit(int n) {
		int count=0;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
		for(;n>0;n/=10) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		CountDigit c=new CountDigit();
		System.out.println(c.countDigit(n));
	}

}
