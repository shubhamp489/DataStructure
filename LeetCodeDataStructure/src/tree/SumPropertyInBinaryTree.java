package tree;

public class SumPropertyInBinaryTree {

	 Node root;
	int isSumProperty(Node node) {
		int left_Data=0,right_Data=0;
		if(node==null && node.left== null && node.right==null)return 1;
		else {
			
			if(node.left!=null)
			left_Data=node.left.data;
			if(node.right!=null)
				right_Data=node.right.data;
			if(
					(node.data==left_Data+right_Data) && 
					isSumProperty(node.left)!=0  && isSumProperty(node.right)!=0)
				return 1;
			else
				return 0;
		
		
		}
		
		
	}
	
	
}
