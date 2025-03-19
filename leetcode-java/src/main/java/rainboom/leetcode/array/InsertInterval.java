package rainboom.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * @author RainbomSea
 *
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    	List<int[]> resultList = new ArrayList<int[]>();
    	int left = newInterval[0];
    	int right = newInterval[1];
    	boolean flag = false;
    	for(int[] interval: intervals) {
    		if(interval[0] > right) {
    			if(!flag) {
    				resultList.add(new int[]{left, right});
    				flag = true;
    			}
    			resultList.add(interval);
    		} else if(interval[1] < left) {
    			resultList.add(interval);
    		} else {
    			left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
    		}
    	}
		if(!flag) {
			resultList.add(new int[] {left, right});
		}
		int[][] result = new int[resultList.size()][2];
		for(int i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i);
		}
    	return result;
    }
}
