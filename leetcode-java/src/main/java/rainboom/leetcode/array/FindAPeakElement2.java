package rainboom.leetcode.array;

/**
 * 1901. 寻找峰值 II <p/>
 *
 * 一个 2D 网格中的 峰值 是指那些 严格大于 其相邻格子(上、下、左、右)的元素。<p/>
 * 给你一个 从 0 开始编号 的 m x n 矩阵 mat ，其中任意两个相邻格子的值都 不相同 。找出 任意一个 峰值 mat[i][j] 并 返回其位置 [i,j] 。<p/>
 * 你可以假设整个矩阵周边环绕着一圈值为 -1 的格子。<p/>
 * 要求必须写出时间复杂度为 O(m log(n)) 或 O(n log(m)) 的算法 <p/>
 *
 */
public class FindAPeakElement2 {

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int i = (low + high) / 2, j = -1;
            int maxValue = -1;
            for(int k = 0; k < n; k++) {
                if(maxValue < mat[i][k]) {
                    j = k;
                    maxValue = mat[i][k];
                }
            }
            if(i - 1>= 0 && mat[i][j] < mat[i-1][j]) {
                high = i - 1;
                continue;
            }
            if(i + 1 < m && mat[i][j] < mat[i+1][j]) {
                low = i + 1;
                continue;
            }
            return new int[]{i, j};
        }
        return new int[0];
    }
}
