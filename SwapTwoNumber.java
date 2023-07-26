public class SwapTwoNumber {
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		SwapTwoNumber.swap(10,20 );
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+"is value of a");
		System.out.println(b+"is value of b");
	}
}
