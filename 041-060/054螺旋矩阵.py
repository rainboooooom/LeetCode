"""

给定一个包含 m x n 个元素的矩阵（m 行, n 列），

请按照顺时针螺旋顺序，返回矩阵中的所有元素。

"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: return []
        H, W = len(matrix), len(matrix[0])
        visited = [[False] * W for _ in range(H)]
        res = []
        dx = [0, 1, 0, -1]
        dy = [1, 0, -1, 0]
        x = y = di = 0
        for _ in range(H * W):
            res.append(matrix[x][y])
            visited[x][y] = True
            rx, ry = x + dx[di], y + dy[di]

            if 0 <= rx < H and 0 <= ry < W and not visited[rx][ry]:
                x, y = rx, ry

            else:
                di = (di + 1) % 4
                x, y = x + dx[di], y + dy[di]

        return res


