package dynamicProgrammingPattern;

import java.util.Arrays;

public class ReverseOfWordsinStrigIII {

	private static String revWord(String str) {
		
			if(str.isEmpty())return str;
			return revWord(str.substring(1))+str.charAt(0);
		
	}
	
	
	public static void main(String[] args) {
		String s1="Let's take LeetCode contest";
		 StringBuilder str1 = new StringBuilder();
		String[] s2=s1.split(" ");
		for(int a =0;a<s2.length;a++) {
			str1.append(revWord(s2[a]));
			str1.append(" ");
		}
		
		System.out.println(str1.toString().trim());
	}

}
