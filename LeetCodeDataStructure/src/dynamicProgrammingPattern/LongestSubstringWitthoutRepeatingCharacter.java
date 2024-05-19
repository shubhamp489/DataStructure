package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWitthoutRepeatingCharacter {

	public static int maxLength(String str) {
		int left=0;int maxLength=0;
		Map<Character,Integer> visitedCharacter = new HashMap<>();
		for(int right = 0 ; right < str.length();right++) {
			char currentCharacter=str.charAt(right);
			if(visitedCharacter.containsKey(currentCharacter) && visitedCharacter.get(currentCharacter)>=left) {
				left=visitedCharacter.get(currentCharacter)+1;
			}
			maxLength=Math.max(maxLength,right-left+1);
			visitedCharacter.put(currentCharacter,right);
			
		}
		return maxLength;
	}
	
	
	
	
	public static void main(String[] args) {
		String  s = "bbbbb";
		System.out.println(maxLength(s));
	}

}
