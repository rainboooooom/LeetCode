package rainbomsea.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 
 * 给定一个二叉树，返回它的中序 遍历。
 * @author RainbomSea
 *
 */
public class BinaryTreeInorderTraversal {
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode cur = root;
    	
    	while(cur != null || !stack.isEmpty()) {
    		while(cur != null) {
    			stack.push(cur);
    			cur = cur.left;
    		}
    		cur = stack.pop();
    		result.add(cur.val);
    		cur = cur.right;
    	}
    	
		return result;
    }

}
