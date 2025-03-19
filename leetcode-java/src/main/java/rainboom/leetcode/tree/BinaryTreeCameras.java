package rainboom.leetcode.tree;

/**
 * 968. 监控二叉树
 * 给定一个二叉树，我们在树的节点上安装摄像头。
 * 节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
 * 计算监控树的所有节点所需的最小摄像头数量。
 *
 */
public class BinaryTreeCameras {
    private int ans = 0;

    public int minCameraCover(TreeNode root) {
        if(dfs(root) == 2){ // 节点不可关就需要添加一个监视器
            ans++;
        }
        return ans;
    }

    // 节点共有三种状态->0:该节点安装了监视器 1:该节点可观，但没有安装监视器 2:该节点不可观
    private int dfs(TreeNode node) {
        if(node == null) {
            return 1;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        // 注意这里 if else 顺序不能换
        if(left == 2 || right == 2) { // 如果有子节点不可观，那么父节点就需要安装监视器
            ans++;
            return 0;
        }else if(left == 0 || right == 0) { // 如果子节点其中一个安装了监视器，那么父节点就可观
            return 1;
        }else { // 叶子节点或者子节点都可以被观测但没有装监视器, 自己装会太亏，所以告知父节点去安装监视器，让自己能被覆盖
            return 2;
        }
    }
}
