package dynamicProgrammingPattern;

import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

public class TopKFrequentElements {

	
	public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];                
        
        for (int num : nums)
            count.merge(num, 1, Integer::sum);
        
        for (int key : count.keySet()){
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
        
	
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3};
		int k=2;
		TopKFrequentElements elements = new TopKFrequentElements();
		
		System.out.println(Arrays.toString(elements.topKFrequent(arr, k)));
		
	}
}
