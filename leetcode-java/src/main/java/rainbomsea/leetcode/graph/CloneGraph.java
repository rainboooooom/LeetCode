package rainbomsea.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 133. 克隆图
 * 
 * 给定无向连通图中一个节点的引用，返回该图的深拷贝（克隆）。
 * @author RainbomSea
 *
 */
public class CloneGraph {
    public Node cloneGraph(Node node) {
    	if(node == null) return null;
    	
    	Map<Integer, Node> map = new HashMap<Integer, Node>();
    	Queue<Node> queue = new LinkedList<Node>();
    	queue.add(node);
    	Node result = new Node(node.val, new ArrayList<Node>());
    	map.put(result.val, result);
    	
    	while(!queue.isEmpty()) {
    		Node curr = queue.poll();
    		for(Node neighbor : curr.neighbors) {
    			if(!map.containsKey(neighbor.val)) {
    				Node temp = new Node(neighbor.val, new ArrayList<Node>());
    				map.put(temp.val, temp);
    				queue.add(neighbor);
    			}
    			map.get(curr.val).neighbors.add(map.get(neighbor.val));
    		}
    	}
    	
    	return result;
    }
}
