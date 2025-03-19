package rainboom.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 559. N叉树的最大深度
 * 
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * @author RainbomSea
 *
 */
public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
    	if(root == null)
    		return 0;
    	Queue<Node> queue = new LinkedList<Node>();
    	int ans = 0;
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		int count = queue.size();
    		ans++;
    		while(count > 0) {
    			Node node = queue.poll();
    			for(Node child: node.children) {
    				queue.add(child);
    			}
    			count--;
    		}
    	}
    	return ans;
    }
}
