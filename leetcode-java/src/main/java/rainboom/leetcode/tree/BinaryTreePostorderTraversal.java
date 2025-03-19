package rainboom.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 */
public class BinaryTreePostorderTraversal {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return result;
    }

    private void postorder(TreeNode node) {
        if(node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        result.add(node.val);
    }
}
