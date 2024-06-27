package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.List;

public class FindwordsContainingCharacter {
	
	 public List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> result= new ArrayList<>();
	        for(int a =0;a<words.length;a++){
	            if(words[a].indexOf(x)!=-1){
	                result.add(a);
	            }
	        }
	    return result;

	    }

	public static void main(String[] args) {
		

	}

}
