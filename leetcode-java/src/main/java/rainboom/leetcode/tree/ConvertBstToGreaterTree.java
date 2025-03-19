package rainboom.leetcode.tree;

/**
 * 538. 把二叉搜索树转换为累加树
 *
 * 给定一个二叉搜索树（Binary Search Tree），
 * 把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * @author RainbomSea
 */
public class ConvertBstToGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
