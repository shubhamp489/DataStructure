package tree;

public class DiameterOfTree {
static class A{
	int ans = Integer.MIN_VALUE;
}
static int height(Node root , A a) {
	if(root == null)return 0;
	
	int left_height=height(root.left, a);
	int right_height=height(root.right,a);
	a.ans=Math.max(a.ans,1+left_height+right_height);
	
	return 1+Math.max(left_height, right_height);
}

static int diameter(Node root) {
	A a= new A();
	if(root==null)return 0;
	int height =height(root,a);
	return a.ans;
}
	

public static void main(String[] args) {
	Node root = new Node(1);
	 root.left = new Node(2); 
	    root.right = new Node(3); 
	    root.left.left = new Node(4); 
	    root.left.right = new Node(5);
	    System.out.println("Diameter is  " + diameter(root));
}
	
}
