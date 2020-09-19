package rainbomsea.leetcode.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。
 * （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * @author RainbomSea
 */
public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for(int i=0; i < size; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(0, level);
        }
        return result;
    }
}
