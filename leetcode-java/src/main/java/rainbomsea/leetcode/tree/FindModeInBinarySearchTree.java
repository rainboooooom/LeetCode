package rainbomsea.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），
 * 找出 BST 中的所有众数（出现频率最高的元素）。
 * @author RainbomSea
 */
public class FindModeInBinarySearchTree {
    List<Integer> result = new ArrayList<>();

    Integer curValue = 0;
    Integer curCount = 0;
    Integer maxCount = 0;

    public int[] findMode(TreeNode root) {
        dfs(root);
        int size = result.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = result.get(i);
        }
        return ans;

    }

    private void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        dfs(root.left);
        if(this.curValue == root.val) {
            this.curCount++;
        }else {
            this.curValue = root.val;
            this.curCount = 1;
        }

        if(this.curCount == maxCount) {
            this.result.add(this.curValue);
        }else if(this.curCount > this.maxCount) {
            this.result.clear();
            this.result.add(this.curValue);
            this.maxCount = this.curCount;
        }
        dfs(root.right);
    }
}
