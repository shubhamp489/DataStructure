package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map;

public class Numbersof1Bits {

	public static void main(String[] args) {
		int n=00000000000000000000000000001011;
		int result =0;
		
		char[] digits = String.valueOf(n).toCharArray();
		System.out.println(digits);
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : digits) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
		
	}

}}
