package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PracticeString {

	public static void main(String[] args) {
		String inputString = "hjvswuvcuyewvcewcyewvcyewcewceywcvewvcewhvceuwyvcewvcwivcywvcewcewdcew";
		char[] charray=inputString.toCharArray();
	   HashMap<Character,Integer> CharCount= new HashMap<Character,Integer>();
	   for(char ch:charray) {
		   if(CharCount.containsKey(ch))
			   CharCount.put(ch,CharCount.get(ch)+1);
		   else
			   CharCount.put(ch,1);
	   }
	   
	   
	   for(Map.Entry entry: CharCount.entrySet()) {
		   System.out.println(entry.getKey()+"----"+entry.getValue());
	   }
	
	
	}

}
