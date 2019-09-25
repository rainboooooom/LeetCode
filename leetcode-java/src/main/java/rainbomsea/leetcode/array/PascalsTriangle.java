package rainbomsea.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @author RainbomSea
 *
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(numRows == 0)
    		return result;
    	
    	result.add(new ArrayList<>());
    	result.get(0).add(1);
    	
    	for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(i-1);

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);

            result.add(row);
        }
    	return result;
    }
}
