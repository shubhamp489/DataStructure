package dynamicProgrammingPattern;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		int[] nums= {3,2,1,5,6,4};
	 for(int a=0;a<nums.length;a++) {
		 for(int b =0;b<nums.length-1;b++) {
			 if(nums[b]>nums[b+1]) {
				 int temp = nums[b+1];
				 nums[b+1]=nums[b];
				 nums[b]=temp;
			 }
		 }
	 }
	 System.out.println(Arrays.toString(nums));

	}

}
