"""

给定一个 n × n 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

"""

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        matrix[:] = matrix[::-1]
        n = len(matrix[0])

        for i in range(n):
            for j in range(i, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

