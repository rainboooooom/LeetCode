"""

n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，

并且使皇后彼此之间不能相互攻击。

"""

class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:

        cols = [0] * n
        hill_diagonals = [0] * (2 * n - 1)
        dale_diagonals = [0] * (2 * n - 1)
        queens = set()
        res = []
        
        def backtrack(row = 0):
            for col in range(n):
                if not (cols[col] + hill_diagonals[row - col] + dale_diagonals[row + col]):
                    queens.add((row, col))
                    cols[col] = 1
                    hill_diagonals[row - col] = 1
                    dale_diagonals[row + col] = 1

                    if row + 1 == n:
                        ans = []
                        for _, col in sorted(queens):
                            ans.append('.' * col + 'Q' + '.' * (n - col - 1))
                        res.append(ans)
                    else:
                        backtrack(row + 1)

                    queens.remove((row, col))
                    cols[col] = 0
                    hill_diagonals[row - col] = 0
                    dale_diagonals[row + col] = 0

        backtrack(0)

        return res


