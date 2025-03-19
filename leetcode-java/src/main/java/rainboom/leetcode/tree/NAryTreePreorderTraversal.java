package rainboom.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
	List<Integer> result = new ArrayList<Integer>();
    
	public List<Integer> preorder(Node root) {
		helper(root);
    	return result;
    }

	public void helper(Node root) {
		if(root == null) {
			return ;
		}
		result.add(root.val);
		for(Node child:root.children) {
			helper(child);
		}
	}
}
