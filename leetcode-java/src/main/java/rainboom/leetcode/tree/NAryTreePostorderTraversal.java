package rainboom.leetcode.tree;

import java.util.ArrayList;
import java.util.List;


/**
 * 590. N叉树的后序遍历
 * 
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * @author RainbomSea
 *
 */
public class NAryTreePostorderTraversal {
	List<Integer> result = new ArrayList<Integer>();
    
	public List<Integer> postorder(Node root) {
		helper(root);
    	return result;
    }

	public void helper(Node root) {
		if(root == null) {
			return ;
		}
		for(Node child:root.children) {
			helper(child);
		}
		result.add(root.val);
	}
}
