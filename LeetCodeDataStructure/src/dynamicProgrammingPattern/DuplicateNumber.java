package dynamicProgrammingPattern;

import java.util.HashMap;

public class DuplicateNumber {
	
	    public int findDuplicate(int[] nums) {
	        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	        int result=0;
	        for(int number : nums){
	            if(hm.containsKey(number)){
	                result=number;
	                break;
	            }
	            else{
	                hm.put(number,1);
	            }
	        }
	        return result;
	    }
	    
	    public static void main(String args[]) {
	    	int[] number = {1,2,3,4,5,6,2};
	    	DuplicateNumber dm = new DuplicateNumber();
	    	int result =dm.findDuplicate(number);
	    System.out.println(result);
	    }
	
}
