package tree;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {
	public List<Integer> largestValues(Node root) {
        List<Integer> largest_vals = new ArrayList();
        helper_method(root,largest_vals,0);
        return largest_vals;
        
    }
	
	
	
	
	
	
	private void helper_method(Node root, List<Integer> largest_vals, int level) {
		if(root == null)return;
		
		if(level==largest_vals.size()) {
		largest_vals.add(root.data);
	}
		else {
			largest_vals.set(level,Math.max(largest_vals.get(level),root.data));
		}
		helper_method(root.left, largest_vals, level+1);
		helper_method(root.right, largest_vals, level+1);

	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
