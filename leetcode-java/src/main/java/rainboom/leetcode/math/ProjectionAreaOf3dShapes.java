package rainboom.leetcode.math;

/**
 * 883. 三维形体投影面积
 * @Description: ProjectionAreaOf3dShapes
 * @Author rainbomsea
 * @Date: 2022/4/26 10:34
 * @Version 1.0
 */
public class ProjectionAreaOf3dShapes {
    public int projectionArea(int[][] grid) {
        int xyArea = 0, xzArea = 0, yzArea = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int yzHeight = 0, xzHeight = 0;
            for (int j = 0; j < n; j++) {
                xyArea += grid[i][j] > 0 ? 1 : 0;
                yzHeight = Math.max(yzHeight, grid[i][j]);
                xzHeight = Math.max(xzHeight, grid[j][i]);
            }
            xzArea += xzHeight;
            yzArea += yzHeight;
        }
        return xyArea + xzArea + yzArea;
    }
}
