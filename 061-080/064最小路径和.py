"""

给定一个包含非负整数的 m x n 网格，

请找出一条从左上角到右下角的路径，

使得路径上的数字总和为最小。

"""

class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        dp = [[0] * n for _ in range(m) ]
        
        # 初始化首位置
        dp[0][0] = grid[0][0]
        # 初始化列
        for i in range(1, m):
            dp[i][0] = dp[i-1][0] + grid[i][0]
            
        # 初始化行
        for j in range(1, n):
            dp[0][j] = dp[0][j-1] + grid[0][j]
        
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])
            
        return dp[-1][-1]
