package dynamicProgrammingPattern;

public class SumOfTwoIntegresWithoutUsingsign {

	public static void main(String[] args) {
		
		int a =12 ,b=2;
		while(b!=0) {
			int temp =(a & b) <<1;
			a=(a^b);
			b=temp;
		}
		System.out.println(a);
	}

}
