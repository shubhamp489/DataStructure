package dynamicProgrammingPattern;

import java.util.LinkedList;
import java.util.List;

public class PalindromicSubstring {
	int result =0;
	public int countSubStrings(String s) {
		for(int a=0 ; a<s.length();a++) {
			count(s,a,a);
			count(s,a,a+1);
		}
		
		return result;
	}
	private void count(String s,int start , int end) {
		
		while(start>=0 && end <s.length() && s.charAt(start)==s.charAt(end)) {
			result++;
			start--;
			end++;
			
		}
		
	}
	
	public static void main(String args[]) {
		String name="aaa";
		PalindromicSubstring pa = new PalindromicSubstring();
		System.out.println(pa.countSubStrings(name));
		
	}
	
	
	
}
