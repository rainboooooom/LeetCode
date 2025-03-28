package rainboom.leetcode.tree;

/**
 * 104. 二叉树的最大深度
 * 
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * @author RainbomSea
 *
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
