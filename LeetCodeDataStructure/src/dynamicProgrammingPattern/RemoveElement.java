package dynamicProgrammingPattern;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int val =2;
		
		int[] result= new int[nums.length];
		for(int a=0;a<nums.length;a++) {
			if(nums[a]!=val) {
				result[a]=nums[a];
				
			}
			else {
				//result[a]=nums. nums[a];
			
			
		}
		

	}
		System.out.println(Arrays.toString(result));
	}}
