"""

给定一个正整数 n，生成一个包含 1 到 n2 所有元素，

且元素按顺时针顺序螺旋排列的正方形矩阵。

"""

class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        res = [[0] * n for _ in range(n)]
        dx = [0, 1, 0, -1]
        dy = [1, 0, -1, 0]
        x = y = di = 0
        for i in range(n * n):
            res[x][y] = i + 1
            rx, ry = x + dx[di], y + dy[di]

            if 0 <= rx < n and 0 <= ry < n and res[rx][ry] == 0:
                x, y = rx, ry

            else:
                di = (di + 1) % 4
                x, y = x + dx[di], y + dy[di]

        return res

