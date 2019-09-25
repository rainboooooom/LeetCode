package rainbomsea.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 
 * 给定一个二叉树，返回它的中序 遍历。
 * @author RainbomSea
 *
 */
public class BinaryTreeInorderTraversal {
	List<Integer> result = new ArrayList<>();
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	helper(root);
		return result;
    }

	public void helper(TreeNode root) {
		if(root == null) return ;
	
		helper(root.left);
		result.add(root.val);
		helper(root.right);
	}
}
