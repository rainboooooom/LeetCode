package rainbomsea.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 417. 太平洋大西洋水流问题
 * @Description: PacificAtlanticWaterFlow
 * @Author rainbomsea
 * @Date: 2022/4/27 09:37
 * @Version 1.0
 */
public class PacificAtlanticWaterFlow {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] heights;
    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        this.m = heights.length;
        this.n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        List<List<Integer>> result  = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            dfs(i, 0, pacific);
            dfs(i, n-1, atlantic);
        }
        for (int j = 0; j < n; j++) {
            dfs(0, j, pacific);
            dfs(m-1, j, atlantic);
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                }
            }
        }

        return result;
    }

    private void dfs(int row, int col, boolean[][] ocean) {
        if(ocean[row][col]) {
            return;
        }
        ocean[row][col] = true;
        for(int[] dir: dirs) {
            int newRow = row + dir[0], newCol = col + dir[1];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                    && heights[newRow][newCol] >= heights[row][col] ) {
                dfs(newRow, newCol, ocean);
            }
        }
    }
}
