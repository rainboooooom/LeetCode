package rainboom.leetcode.tree;

/**
 * 979. 在二叉树中分配硬币
 * 
 * 给定一个有 N 个结点的二叉树的根结点 root，树中的每个结点上都对应有 node.val 枚硬币，并且总共有 N 枚硬币。
 * 在一次移动中，我们可以选择两个相邻的结点，然后将一枚硬币从其中一个结点移动到另一个结点。(移动可以是从父结点到子结点，或者从子结点移动到父结点。)。
 * 返回使每个结点上只有一枚硬币所需的移动次数。
 * @author RainbomSea
 *
 */
public class DistributeCoinsInBinaryTree {
	int ans = 0;
    public int distributeCoins(TreeNode root) {
    	dfs(root);
		return ans;
    }
	private int dfs(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int L = dfs(root.left);
		int R = dfs(root.right);
		ans += Math.abs(L) + Math.abs(R);
		return root.val + L + R -1;
	}
}
