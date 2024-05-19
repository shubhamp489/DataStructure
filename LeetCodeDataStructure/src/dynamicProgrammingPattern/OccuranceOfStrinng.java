package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfStrinng {

	public static void  charOccuranceCount(String str) {
		Map<Character,Integer> map = new HashMap<>();
		char[] StrToCharArray =str.toCharArray();
		
		for(char ch :StrToCharArray) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey() +", value: "+entry.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		String s1 ="yudcxvweyuqvyuewcvuyewcuyewcuewvucewucewucuewvcuvewcvuew";
		charOccuranceCount(s1);
	}

}
