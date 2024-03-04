package dynamicProgrammingPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
	

	public static void main(String args[]) {
		String s = "egg";
		String t = "add";
		int temp=0;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		
		
		for (char data1 : s.toCharArray()) {
			if (map1.containsKey(data1)) {
				map1.put(data1, map1.get(data1) + 1);
			}

			else {
				map1.put(data1, 1);
			}
		}
			
			for (char data2 : t.toCharArray()) {
				if (map1.containsKey(data2)) {
					map1.put(data2, map1.get(data2) + 1);
				}

				else {
					map1.put(data2, 1);
				}
			}
			
			
			}
}