package rainbomsea.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

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
					Queue<Integer> queue = new LinkedList<Integer>();
					queue.add(i * grid[0].length + j);
					while(!queue.isEmpty()) {
						int num = queue.remove();
						int row = num / grid[0].length;
						int col = num % grid[0].length;
						if(row - 1 >= 0 && grid[row-1][col] == '1') {
							queue.add((row-1)*grid[0].length + col);
							grid[row-1][col] = '0';
						}
						if(row + 1 < grid.length && grid[row+1][col] == '1') {
							queue.add((row+1)*grid[0].length + col);
							grid[row+1][col] = '0';
						}
						if(col - 1 >= 0 && grid[row][col-1] == '1') {
							queue.add(row*grid[0].length + col - 1);
							grid[row][col-1] = '0';
						}
						if(col + 1 < grid[0].length && grid[row][col+1] == '1') {
							queue.add(row*grid[0].length + col + 1);
							grid[row][col+1] = '0';
						}
					}
				}
			}
		}
    	
    	return ans;
    }
}
