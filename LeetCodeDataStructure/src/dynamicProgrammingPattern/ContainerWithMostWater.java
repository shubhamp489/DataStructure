package dynamicProgrammingPattern;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		
		int max=1*height[1];
		for(int a =1;a<height.length;a++) {
			if(max<((a+1)*height[a])) {
				max=a*height[a];
				System.out.println(max);
			}
		}
		
		
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater cmContainerWithMostWater  = new ContainerWithMostWater();
		System.out.println(cmContainerWithMostWater.maxArea(height));
		
	}

}
