package rainboom.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 113. 路径总和 II
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 */
public class PathSumII {

    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return result;
    }

    private void dfs(TreeNode node, int sum) {
        if(node == null) {
            return;
        }
        path.add(node.val);
        sum -= node.val;
        if(node.right == null && node.left == null) {
            if(sum == 0) {
                result.add(new LinkedList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }
        dfs(node.left, sum);
        dfs(node.right, sum);
        path.remove(path.size() -  1);
    }
}
