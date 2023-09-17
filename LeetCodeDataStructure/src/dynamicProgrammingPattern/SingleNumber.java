package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,3,3,4};
		int size =nums.length;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int count : nums) {
			if(map.containsKey(count)) {
				map.put(count,map.get(count)+1);
			}
			else
				map.put(count,1);
		}
		
	 for(Entry<Integer, Integer> entry: map.entrySet()) {
		 if(!(entry.getValue()==1)) {
			 continue;
		 }
		 else
		 System.out.println(entry.getKey());
	 }
		
	}

}
