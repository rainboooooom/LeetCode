package rainboom.leetcode.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N叉树的层序遍历
 * 
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 * @author RainbomSea
 *
 */
public class NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(root == null) return null;
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		List<Integer> level = new ArrayList<Integer>();
    		int n = queue.size();
    		while(n > 0) {
    			n--;
    			Node cur = queue.poll();
    			level.add(cur.val);
    			for (Node node : cur.children) {
					queue.add(node);
				}
    		}
    		result.add(level);
    	}
		return result;
    }
}
