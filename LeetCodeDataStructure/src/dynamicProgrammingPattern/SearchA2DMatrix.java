package dynamicProgrammingPattern;

public class SearchA2DMatrix {

	 public boolean searchMatrix(int[][] matrix, int target) {
		int flag =0;
		for(int i = 0; i <matrix.length;i++) {
			int low=0,high=matrix[i].length-1;
			while(low<=high) {
				int mid = low +(high-low)/2;
				if(matrix[i][mid]==target)return true;
				else if (matrix[i][mid]>target) {
					high= mid-1;}
				else {
						low=mid+1;
				}
			}
	
		 
		} 
		return false;	
		  
	    }
	 
	 public static void main(String[] args) {
			int[][] mat= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
			int target =3;
			
			SearchA2DMatrix sd= new SearchA2DMatrix();
			System.out.println(sd.searchMatrix(mat, target));


}}
	
	
	

