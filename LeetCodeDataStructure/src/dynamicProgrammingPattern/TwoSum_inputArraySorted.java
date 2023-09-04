package dynamicProgrammingPattern;

import java.util.Arrays;



public class TwoSum_inputArraySorted {

	public static void main(String[] args) {
		int[] numbers= {5,25,75};
		int[] result= {0,0};
		int target=100;
		int a=0;
		int sum=0;
		for(a=0;a<numbers.length;a++) {
			for(int b=1;b<numbers.length;b++) {
				sum=numbers[a]+numbers[b];
				if(!(sum==target)) {
					continue;
				}
				else {
					if(a!=b && a<b) {
					result[1]=b+1;
					result[0]=a+1;
					break;}
										
				}	if (a!=b && a>b) {
					result[0]=b+1;
					result[1]=a+1;
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(result));
		

	}

}
