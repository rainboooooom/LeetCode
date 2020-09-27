package rainbomsea.leetcode.tree;

/**
 * 235. 二叉搜索树的最近公共祖先
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * @author RainbomSea
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = root;
        while (true) {
            if(p.val < ans.val && q.val < ans.val) {
                ans = ans.left;
            } else if (p.val > ans.val && q.val > ans.val) {
                ans = ans.right;
            } else {
                break;
            }
        }
        return ans;
    }
}
