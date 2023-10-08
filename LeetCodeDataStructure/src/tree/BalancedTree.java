package tree;

public class BalancedTree {
	 Node root;
	static int maxDepth(Node node) {
		
		int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);
		int ans =rDepth-lDepth;
		
		if(ans>2)return 1;
		else return 0;
		
	}
	
	
	
	
	
	static boolean isBalanced(Node root) {
		if(maxDepth(root)==1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		 root.left = new Node(2); 
		    root.right = new Node(3); 
		    root.left.left = new Node(4); 
		    root.left.right = new Node(5);
        if(isBalanced(root)) {
        	System.out.println("Balanced");
        }
        else System.out.println("Not Balanced");
	
	
	}
	
	
	
	
	
}
