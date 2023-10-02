package tree;
/*Recursively do a Depth-first search.
If the tree is empty then return 0
Otherwise, do the following
Get the max depth of the left subtree recursively  i.e. call maxDepth( tree->left-subtree)
Get the max depth of the right subtree recursively  i.e. call maxDepth( tree->right-subtree)
Get the max of max depths of left and right subtrees and add 1 to it for the current node.
max_depth = max(max dept of left subtree,  max depth of right subtree) + 1
Return max_depth.*/
public class HeightOfBinaryTree {
	 Node root;
	 
	    /* Compute the "maxDepth" of a tree -- the number of
	       nodes along the longest path from the root node
	       down to the farthest leaf node.*/
	    int maxDepth(Node node)
	    {
	        if (node == null)
	            return 0;
	        else {
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.left);
	            int rDepth = maxDepth(node.right);
	 
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	            else
	                return (rDepth + 1);
	        }
	    }

	    /* Driver program to test above functions */
	    public static void main(String[] args)
	    {
	    	HeightOfBinaryTree tree = new HeightOfBinaryTree();
	 
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.left.right.right= new Node(6);
	 
	        System.out.println("Height of tree is "
	                           + tree.maxDepth(tree.root));
	    }}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Solution using Level Order traversal
 * 
 * Class binaryTree{
 * Node root;
 * 
 * void printLevelOrder(){
 * Queue<Node> queue = new LinkedList<Node>();
 * queue.add(root);
 * while(!queue.isEmpty()){
 * Node tempnode = queue.poll();
 * System.out.print(tempNode.data+ " "); 
 * 
 *Enueue left child 
 if(tempNode.left!= null) {
	 queue.add(tempNode.left)
 }
 *if(tempNode.right!= null){
 *queue.add(tempNode.right); 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

