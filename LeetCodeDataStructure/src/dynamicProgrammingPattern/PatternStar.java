package dynamicProgrammingPattern;

public class PatternStar {

	public static void main(String[] args) {
		for(int a=0;a<5;a++) {
			for(int b=0;b<5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");

		for(int a=0;a<5;a++) {
			for(int b=a;b<5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		
		for(int a=5;a>0;a--) {
			for(int b=a;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		for(int a=0; a<=5;a++) {
			for(int b =a;b>=0;b--) {
				System.out.print(" ");
				System.out.print("*");
				
			}
			System.out.println();
			for(int c=5;c>=a;c--) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
	}

}
