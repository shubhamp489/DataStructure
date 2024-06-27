package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map;

public class UniqueDigitFromArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,3,4,9,8,5,5,5,6,6,6,8};
		String[] array= {"abc","abc","abc","abc","wert","wert","wert"}; 
		HashMap<Integer,Integer> map= new HashMap<>();
		HashMap<String ,Integer> stringMap= new HashMap<String, Integer>();
		for(int num :arr) {
			map.put(num,map.getOrDefault(num,0)+1);
		}
		
		for(String elementCount: array) {
			stringMap.put(elementCount,stringMap.getOrDefault(elementCount, 0)+1);
		}
		
		
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
			System.out.println("Key is :"+ entry.getKey() +"   Value is :"+ entry.getValue());
		}
		
		
		for(Map.Entry<String,Integer> strmap: stringMap.entrySet()) {
			System.out.println("Key is :"+ strmap.getKey() +"   Value is :"+ strmap.getValue());
			
		}
		
	}

}
