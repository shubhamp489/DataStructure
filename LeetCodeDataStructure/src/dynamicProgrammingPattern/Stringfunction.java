package dynamicProgrammingPattern;

public class Stringfunction {
	 public static int maxArea(int[] nums) {
		 int left=0,right = nums.length-1,result=0;
		 while(left<right) {
			 int leftHeight=nums[left];
			 int rightheight=nums[right];
			 
			 int minheight=leftHeight < rightheight ? leftHeight: rightheight;int width=right-left;
			 int currentArea= width*minheight;
			 result= result > currentArea ? result :currentArea;
			 
			 while(left<=right && nums[left]<=minheight) {
				 left++;
			 }
			 while(right>=left && nums[right]<=minheight) {
				 right--;
			 }
			
			 
		 }

		 return result;
	 }
	 
	 public static void main(String args[]) {
		 int[] height = {1,8,6,2,5,4,8,3,7};
		 
		 System.out.println(maxArea(height));
	 }
}
