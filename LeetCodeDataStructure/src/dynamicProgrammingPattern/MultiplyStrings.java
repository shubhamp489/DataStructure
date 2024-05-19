package dynamicProgrammingPattern;

public class MultiplyStrings {
	 public String multiply(String num1, String num2) {
	        int result= Integer.valueOf(num1)*Integer.valueOf(num2);
	        return String.valueOf(result);
	        		}
	 	public static void main(String args[]) {
	 		MultiplyStrings ms = new MultiplyStrings();
	 		System.out.println(ms.multiply("12","2"));
	 	}

}
