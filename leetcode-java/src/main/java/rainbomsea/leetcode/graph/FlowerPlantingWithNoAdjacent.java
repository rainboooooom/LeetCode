package rainbomsea.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1042. 不邻接植花
 * 
 * 有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。
 * paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。
 * 另外，没有花园有 3 条以上的路径可以进入或者离开。
 * 你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。
 * 以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。
 * 花的种类用  1, 2, 3, 4 表示。保证存在答案。
 * @author RainbomSea
 *
 */
public class FlowerPlantingWithNoAdjacent {
    public int[] gardenNoAdj(int N, int[][] paths) {
    	int[] result = new int[N];
    	Map<Integer, Set<Integer>> map = new HashMap<>();
    	
    	for(int i = 0; i < N; i++) {
    		map.put(i, new HashSet<>());
    	}
    	for(int[] path : paths) {
    		map.get(path[0]-1).add(path[1]-1);
    		map.get(path[1]-1).add(path[0]-1);
    	}
    	
    	for(int i = 0; i < N; i++) {
    		boolean[] used = new boolean[5];
    		for(int num : map.get(i)) {
    			used[result[num]] = true;
    		}
    		for(int j = 1;  j <= 4; j++) {
    			if(!used[j]) {
    				result[i] = j;
    				break;
    			}
    		}
    	}
    	
    	return result;
    }
}
