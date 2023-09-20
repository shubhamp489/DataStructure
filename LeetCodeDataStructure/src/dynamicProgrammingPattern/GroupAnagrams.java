package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[]  strs= {"eat","tea","tan","ate","nat","bat"};
		
		Map<String ,List<String>> map = new HashMap<>();
		for(String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);
			if(!map.containsKey(sortedWord)) {
				map.put(sortedWord,new ArrayList<>());
				
			}
			map.get(sortedWord).add(word);
			
		}
		System.out.println(new ArrayList<>(map.values()));
		
		
	}

}
