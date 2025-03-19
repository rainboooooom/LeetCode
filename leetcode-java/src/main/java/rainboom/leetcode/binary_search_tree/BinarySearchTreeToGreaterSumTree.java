package rainboom.leetcode.binary_search_tree;

/**
 * 1038. 从二叉搜索树到更大和树
 *
 * 给出二叉 搜索 树的根节点，该二叉树的节点值各不相同，
 * 修改二叉树，使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 * @author RainbomSea
 */
public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
