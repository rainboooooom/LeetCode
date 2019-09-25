package rainbomsea.leetcode.two_pointers;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 * 
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * @author RainbomSea
 *
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
    	int[] result = new int[A.length];
    	
    	for(int i = 0; i < result.length; i++) {
    		result[i] = A[i] * A[i];
    	}
    	Arrays.sort(result);
		
    	return result;
    }
}
