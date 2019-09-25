package rainbomsea.leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1161. 最大层内元素和
 * 
 * 给你一个二叉树的根节点 root。设根节点位于二叉树的第 1 层，而根节点的子节点位于第 2 层，依此类推。
 * 请你找出层内元素之和 最大 的那几层（可能只有一层）的层号，并返回其中 最小 的那个。
 * @author RainbomSea
 *
 */
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	int ans = 1, max = root.val;
    	int leval = 1;
    	
    	while(!queue.isEmpty()) {
    		int count = queue.size(); 
    		int sum = 0;
    		while(count > 0) {
    			TreeNode node = queue.poll();
    			sum += node.val;
    			if(node.left != null) {
    				queue.add(node.left);
    			}
    			if(node.right != null) {
    				queue.add(node.right);
    			}
    			count--;
    		}
    		if(sum > max) {
    			ans = leval;
    			max = sum;
    		}
    		leval++;
    	}
		return ans;
    }
}
