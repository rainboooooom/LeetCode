package rainbomsea.leetcode.array;

/**
 * 867. 转置矩阵
 * 
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * @author RainbomSea
 *
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
    	int[][] result = new int[A[0].length][A.length];
    	for (int i = 0; i < A[0].length; i++) {
    		for (int j = 0; j < A.length; j++) {
    			result[i][j] = A[j][i];
    		}
    	}
    	return result;
    }
}
