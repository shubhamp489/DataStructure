package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ResultsAfterRemovingAnagrams {
	
	public static boolean isAnagram(String word1 , String word2) {
		if(word1.length()!=word2.length())return false;
		
		char[] chrArray1= word1.toCharArray();
		char[] crArray2=word2.toCharArray();
		Arrays.sort(chrArray1);
		Arrays.sort(crArray2);
		return Arrays.equals(chrArray1, crArray2);
 		}
	public static List<String> removeAnagrams(String[] words) {
	
		Stack<String> stack = new Stack<>();
		for(String word:words) {
			if(!stack.isEmpty() && isAnagram(stack.peek(), word)) {
				continue;
			}
			stack.push(word);
		}
	
		
		return new ArrayList<String>(stack);
	}
	
	
	
	
	
	public static void main(String[] args) {
		String[] abc= {"eat","tea","tan","ate","nat","bat"};

		System.out.println(removeAnagrams(abc));
	}
	
	}
	
