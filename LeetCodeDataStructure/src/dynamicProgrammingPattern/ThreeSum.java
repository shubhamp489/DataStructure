package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums){
		 Arrays.sort(nums);
	        LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();

	        for (int i = 0; i < nums.length - 2; i++) {
	            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
	                int target = 0 - nums[i];
	                int left = i + 1;
	                int right = nums.length - 1;

	                while (left < right) {
	                    if (nums[left] + nums[right] == target) {
	                        ArrayList<Integer> miniSol = new ArrayList<>();
	                        miniSol.add(nums[i]);
	                        miniSol.add(nums[left]);
	                        miniSol.add(nums[right]);
	                        sol.add(miniSol);
	                        while (left < right && nums[left] == nums[left + 1]) {
	                            left++;
	                        }
	                        while (left < right && nums[right] == nums[right - 1]) {
	                            right--;
	                        }
	                        left++;
	                        right--;
	                    } else if (nums[left] + nums[right] > target) {
	                        right--;
	                    } else {
	                        left++;
	                    }
	                }
	            }
	        }

	        return sol;
	    	
	}
	
	public static void main(String arges[]) {
		int nums[] = {-1,0,1,2,-1,-4};
		ThreeSum ts = new ThreeSum();
		System.out.println(ts.threeSum(nums));
	}

}








/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.*/






