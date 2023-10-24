package dynamicProgrammingPattern;

public class PowerofFour {
	
	 public static boolean isPowerOfFour(int n) {
	     if(n==0)return false;
		 if(n==1)return true;
	     if(n%4==0)return isPowerOfFour(n/4);
	     else return false;
	     
	     
	    }

	public static void main(String[] args) {
		int number=16;
		System.out.println(isPowerOfFour(number));
	}

}
