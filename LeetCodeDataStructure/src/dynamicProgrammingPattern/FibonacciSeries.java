package dynamicProgrammingPattern;

public class FibonacciSeries {

	public static void main(String[] args) {
	int c=0,a=0,b=1,n=4;
	if(n<2) {
		System.out.println(n);
	}
	for(int i=2;i<=n;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	System.out.println(b);
	
	
	}
}
