public class DiscriumNumber {
	public static boolean isDiscrium(int n) {
		int count=0;int z=n; int sum=0;
		//count the number
		while(z>0) {
			z=z/10;
			count++;
		}
		z=n;
		while(z!=0) {
			int lastdigit=z%10;
			int pro=1;
			for(int i=1;i<=count;i++) {
				pro=pro*lastdigit;
			}
			count--;
			sum=sum+pro;
			z=z/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isDiscrium(175));
	}


}
