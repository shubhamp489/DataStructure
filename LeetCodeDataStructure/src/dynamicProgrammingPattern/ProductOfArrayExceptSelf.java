package dynamicProgrammingPattern;

import java.security.PublicKey;
import java.util.Arrays;
public class ProductOfArrayExceptSelf {

//	Solution 1
	public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
	
//	Solution 2
//	 public int[] productExceptSelfNumsAsPrefix(int[] nums) {
//	        int[] output = new int[nums.length];
//	        output[0] = 1;
//
//	        for (int i = 0; i < nums.length - 1; i++) output[i + 1] =
//	            output[i] * nums[i];
//
//	        for (int i = nums.length - 2; i >= 0; i--) {
//	            output[i] = nums[i + 1] * output[i];
//	            nums[i] = nums[i] * nums[i + 1];
//	        }
//	        return output;
//	    }
	
	
	
	
	public static void main(String[] args ) {
		int[] arr= {1,2,3,4};
		ProductOfArrayExceptSelf ps = new ProductOfArrayExceptSelf();
	
		//System.out.println( Arrays.toString(ps.productExceptSelfNumsAsPrefix(arr)));
		System.out.println( Arrays.toString(ps.productExceptSelf(arr)));
		
	}
}
