"""

一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

"""
class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        H = len(obstacleGrid)
        W = len(obstacleGrid[0])

        dp = [[0] * W for _ in range(H)]
        
        # 初始化首位置
        dp[0][0] = 1 if obstacleGrid[0][0] != 1 else 0

        if dp[0][0] == 0: return 0
        
        # 初始化第一列
        for i in range(1, H):
            if obstacleGrid[i][0] != 1:
                dp[i][0] = 1
            else:
                break   # 只要当前位置为0后面的就都为0，所以直接break

        # 初始化第一行
        for j in range(1, W):
            if obstacleGrid[0][j] != 1:
                dp[0][j] = 1
            else:
                break

        for i in range(1, H):
            for j in range(1, W):
                if obstacleGrid[i][j] != 1:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]

        return dp[-1][-1]

