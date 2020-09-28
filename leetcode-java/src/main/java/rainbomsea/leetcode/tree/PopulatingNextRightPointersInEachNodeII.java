package rainbomsea.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 117. 填充每个节点的下一个右侧节点指针 II
 * 给定一个二叉树
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。
 * 如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * @author RainbomSea
 */
public class PopulatingNextRightPointersInEachNodeII {
    public NodeII connect(NodeII root) {
        if(root == null) {
            return root;
        }
        Queue<NodeII> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            NodeII preNode = null;
            for (int i = 0; i < levelCount; i++) {
                NodeII node = queue.poll();
                if (preNode != null) {
                    preNode.next = node;
                }
                preNode = node;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
