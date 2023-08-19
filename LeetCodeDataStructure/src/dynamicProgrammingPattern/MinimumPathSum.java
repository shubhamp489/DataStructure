package dynamicProgrammingPattern;

public class MinimumPathSum {
	 public int minPathSum(int[][] grid) {
		 
		 
		 int[][]dp = new int[grid.length][grid[0].length];
		 dp[0][0]=grid[0][0];
		 for (int i=0;i <grid[0].length;i++) {
			 for(int j =0;j<grid.length;j++) {
				 if(i==0 && j==0)continue;
				 int right =Integer.MAX_VALUE;
				 if(j-1>=0) right = dp[i][j-1]+grid[i][j];
				 int down = Integer.MAX_VALUE;
				 if(i-1 >=0) down =dp[i-1][j]+grid[i][j];
				 dp[i][j]=Math.min(right, down);
			 }
		 }
		 
		 return dp[dp.length-1][dp[0].length-1];
	        
	    }
}


/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*
*Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 200
*
*
*
*
*/
