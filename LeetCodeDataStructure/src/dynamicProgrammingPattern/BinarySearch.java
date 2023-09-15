package dynamicProgrammingPattern;

public class BinarySearch {

	
	
	
	
	
	public static void main(String[] args) {
		
		int [] nums = {-1,0,3,5,9,12};
		int target = 0;
		int left =0;
		int right= nums.length-1;
		int temp=0;
		
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==nums[mid]) {
				System.out.println(mid);
				temp=1;
			}
			if(target>nums[mid])
				left=mid+1;
				
			else
				right = mid-1;
			
		}
		
		if(temp==0) {
			System.out.println("-1");
		}
		
	}
}
