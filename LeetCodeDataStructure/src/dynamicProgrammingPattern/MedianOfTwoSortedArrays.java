package dynamicProgrammingPattern;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int len1 = nums1.length;
    int len2 = nums2.length;
	int[] newArray = new int[nums1.length+nums2.length];
	int i=0,j=0,k=0;
	Double result=0.0;
	
	while(i<len1 && j<len2)
	{
		if(nums1[i]<nums2[j]) {
			newArray[k++]=nums1[i++];
		}
		else {
			newArray[k++]=nums2[j++];
		}
		
	}
	while(i<len1) {
		newArray[k++]=nums1[i++];
	}
	
	while(j<len2) {
		newArray[k++]= nums2[j++];
	}
	System.out.println(Arrays.toString(newArray));
	int length = newArray.length;
	int index=length/2;
	if(newArray.length % 2==0) {
		
		result=(double)( newArray[index]+newArray[index-1])/2;
	}
	else {
		result=(double)newArray[index];
	}
	return result;
    }


	public static void main(String args[]) {
		MedianOfTwoSortedArrays ms = new MedianOfTwoSortedArrays();
		int[] num1= {1,3};int []nums2 = {2};
		System.out.println(ms.findMedianSortedArrays(num1, nums2));
	}



}
