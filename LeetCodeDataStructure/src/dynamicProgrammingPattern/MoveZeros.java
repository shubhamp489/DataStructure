package dynamicProgrammingPattern;

import java.util.Arrays;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int[] result=new int[end+1];
for(int a=0;a<nums.length;a++){
    if(nums[a]==0){
        result[end]=nums[a];
        end--;
    }
    else{
       result[start]=nums[a];
       start++;

    }
}

System.out.println(Arrays.toString(result));
        
    }
public static void main(String args[]) {
	int[] nums= {0,1,0,2,3,4};
	
	MoveZeros mv = new MoveZeros();
	mv.moveZeroes(nums);
	
}

}

