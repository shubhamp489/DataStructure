package dynamicProgrammingPattern;

public class ClimbingStarts {
	
	
	public int climbStairs(int n) {
        if(n%2==0){
            return 2;
        }
        else if(n%2 !=0){
            return n/2 +2;
        }
        else
        return 1;
    }
	
	public static void main(String[] args) {
		ClimbingStarts cs = new ClimbingStarts();
		System.out.println(cs.climbStairs(2));
		
		System.out.println(2/2);
		

	}

}
