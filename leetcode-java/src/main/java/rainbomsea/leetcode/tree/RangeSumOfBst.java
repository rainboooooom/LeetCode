package rainbomsea.leetcode.tree;

/**
 * 938. 二叉搜索树的范围和
 * 
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 * @author RainbomSea
 *
 */
public class RangeSumOfBst {
    public int rangeSumBST(TreeNode root, int L, int R) {
    	int ans = 0;
    	if(root == null) {
    		return 0;
    	}
    	if( root.val >= L && root.val <= R) {
    		ans += root.val;
    	}
    	if(root.val > L) {
    		ans += rangeSumBST(root.left, L, R);
    	}
    	if(root.val < R) {
    		ans += rangeSumBST(root.right, L, R);
    	}
    	
		return ans;
    }
}
