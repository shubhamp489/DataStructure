package dynamicProgrammingPattern;

public class PermutationDifferencebetweenTwoStrings {
	   public int findPermutationDifference(String s, String t) {
	        int result =0;
	        for(int a=0;a<s.length();a++){
	            result+=Math.abs(s.indexOf(s.charAt(a))-t.indexOf(s.charAt(a)));
	        }

	        return result;
	    }
	
	
	public static void main(String[] args) {
		String s="abcde";
		String t ="edbac";
		int n=0;int q=0;
		int result=0;
		for(int a=0;a<s.length();a++) {
		n=s.indexOf(s.charAt(a));
		
		q=t.indexOf(s.charAt(a));
		
		result+=Math.abs(n-q);
			}
	
	System.out.println(result);
	}
}
