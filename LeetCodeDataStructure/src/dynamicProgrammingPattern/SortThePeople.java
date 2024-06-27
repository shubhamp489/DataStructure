package dynamicProgrammingPattern;

import java.util.Arrays;

public class SortThePeople {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] height = {180,165,170};
		int size=height.length;
		for(int a=0;a<size-1;a++) {
			for(int b =0;b<size-a-1;b++) {
				if(height[b]<height[b+1]) {
					int temp1 =height[b+1];
					height[b+1]=height[b];
					height[b]=temp1;
					
					 String temp = names[b+1];
	                    names[b+1]=names[b];
	                    names[b]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
	}

}
