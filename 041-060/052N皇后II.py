"""

n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，

并且使皇后彼此之间不能相互攻击。

给定一个整数 n，返回 n 皇后不同的解决方案的数量。

"""

class Solution:
    def totalNQueens(self, n: int) -> int:
        cols = [0] * n
        hill_diagonals = [0] * (2 * n - 1)
        dale_diagonals = [0] * (2 * n - 1)

        def backtrack(row = 0, ans = 0):
            for col in range(n):
                if not (cols[col] + hill_diagonals[row - col] + dale_diagonals[row + col]):
                    cols[col] = 1
                    hill_diagonals[row - col] = 1
                    dale_diagonals[row + col] = 1

                    if row + 1 == n:
                        ans += 1
                    else:
                        ans = backtrack(row + 1, ans)

                    cols[col] = 0
                    hill_diagonals[row - col] = 0
                    dale_diagonals[row + col] = 0

            return ans

        return backtrack(0, 0)




