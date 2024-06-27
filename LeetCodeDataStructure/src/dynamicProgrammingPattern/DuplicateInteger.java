package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DuplicateInteger {

	public static void main(String[] args) {
		 
		int[] nums= {1,2,2,3,3,3}; int k=2;
		List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int number : nums){
            if(map.containsKey(number)){
                map.put(number ,map.get(number)+1);
            }
            else{
                map.put(number ,1);
            }
        }
  
        for(Map.Entry<Integer ,Integer> entry : map.entrySet()){
            if(entry.getValue() >=k){
               System.out.println(entry.getKey());
               list.add(entry.getKey());
               
               
            }
        }
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
	
}
