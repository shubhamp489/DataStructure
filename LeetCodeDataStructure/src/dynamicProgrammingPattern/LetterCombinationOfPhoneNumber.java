package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LetterCombinationOfPhoneNumber {

	
	
	public static void main(String[] args) {
	Map<Character,String> map = new HashMap<>();	
	map.put('2',"abc");map.put('3',"def");map.put('4',"ghi");map.put('5',"jkl");map.put('6',"mno");
	map.put('7',"pqrs");map.put('8',"tuv");map.put('8',"wxyz");
	String digits="23";
	List<String> result= new LinkedList<>();
	for(int a=0; a<digits.length();a++) {
			result.add(map.get(digits.charAt(a)));
	}
	for(int a=0;a<result.size();a++) {
		for(int b=a+1 ;b<result.size()-1 ;b++) {
			char[] ch=result.get(a).toCharArray();
			
		}
	}
	
	
	
	System.out.println(result);
	}

	
}


