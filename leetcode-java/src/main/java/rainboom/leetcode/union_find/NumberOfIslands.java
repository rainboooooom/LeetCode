package rainboom.leetcode.union_find;

/**
 * 200. 岛屿数量
 * 
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
 * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * @author RainbomSea
 *
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
    	if(grid.length == 0 || grid == null) {
    		return 0;
    	}
    	int ans = 0;
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == '1') {
					ans ++;
					dfs(grid, i, j);
				}
			}
		}
    	
    	return ans;
    }
    
    void dfs(char[][] grid, int i, int j) {
    	if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||  grid[i][j] == '0') {
    		return ;
    	}
    	
    	grid[i][j] = '0';
    	
    	dfs(grid, i-1, j);
    	dfs(grid, i+1, j);
    	dfs(grid, i, j-1);
    	dfs(grid, i, j+1);
    }
}
