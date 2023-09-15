package dynamicProgrammingPattern;

import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

public class TopKFrequentElements {

	public static void main(String[] args) {
		
		
		int k=2;
		HashMap<Integer ,Integer> h1= new HashMap<Integer,Integer>();
		List list = new ArrayList();
		int[] nums= {1,1,1,2,2,3};
		for (int i : nums) {
			if(h1.containsKey(i))
				continue;
			else
				h1.put(i,1);
		}
		System.out.println(h1.entrySet());
		 for (Map.Entry entry : h1.entrySet()){
		//	 System.out.println(entry.getKey() + " " + entry.getValue());
	         int i =(int) entry.getKey();
	         if(i<=k) {
	        	list.add(entry.getKey());
	        	System.out.println(entry.getKey());
	         }
	      }
		
		 int[] arr = new int[list.size()];
		 for(int b=0; b<list.size();b++) {
			 arr[b]=(int) list.get(b);
		 }
	
		
	
	}

}
