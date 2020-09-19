package rainbomsea.leetcode.tree;

/**
 *  404. 左叶子之和
 *
 *  计算给定二叉树的所有左叶子之和。
 *  @author RainbomSea
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root == null) {
            return res;
        }
        if(root.left != null && root.left.left != null && root.left.right != null) {  // 判断是否是左叶子
            res += root.left.val;
        }
        return res + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
