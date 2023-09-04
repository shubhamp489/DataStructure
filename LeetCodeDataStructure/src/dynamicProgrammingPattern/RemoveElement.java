package dynamicProgrammingPattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums = {5,1,2,2,3,5,4,2};
		int val =2;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int a=0;a<nums.length;a++) {
			if(nums[a]!=val) {
				list.add(nums[a]);
			}
		}
		Iterator i =list.iterator();
		while(i.hasNext()){
		System.out.println(i.next());	
		}
	

	}}
