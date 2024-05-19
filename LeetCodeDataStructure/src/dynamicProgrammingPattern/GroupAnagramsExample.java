package dynamicProgrammingPattern;

import java.util.*;

public class GroupAnagramsExample {
			public static List<List<String>> groupAnagramslist(String[] strs){
				Map<String,List<String>> map = new HashMap<>();
				for(String word : strs) {
					char[] chars = word.toCharArray();
					Arrays.sort(chars);
					String sortedWord= new String(chars);
					if(!map.containsKey(sortedWord)) {
						map.put(sortedWord,new ArrayList<String>());
						
					}
					map.get(sortedWord).add(word);
				}
				return new ArrayList<>(map.values());
			}
			
			public static void main(String[] args) {
				String[] abc= {"eat","tea","tan","ate","nat","bat"};
		
				System.out.println(groupAnagramslist(abc));
			}
			
}
