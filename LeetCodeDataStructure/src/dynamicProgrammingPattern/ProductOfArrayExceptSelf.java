package dynamicProgrammingPattern;

import java.util.Arrays;
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		int[] result =nums.clone();
		
	for(int a=0;a<nums.length;a++) {
		int temp=a;
		while(temp>0) {
			result[a]=nums[temp];
			
			temp--;
		//	System.out.println(temp);
		}
		
		System.out.println(Arrays.toString(result));
	}
		
		
		
	}

}
