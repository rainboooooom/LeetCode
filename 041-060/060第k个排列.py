"""

给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：

"""

class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        if not n:
            return []

        nums = [i for i in range(1, n+1)]
        visited = [False for _ in range(n)]
        factorial = [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880]
        res = []

        def backtrack(n, k, depth):
            if depth == n:
                return ''.join(res)

            ps = factorial[n - 1 - depth]

            for i in range(n):
                if visited[i]:
                    continue
                if ps < k:
                    k -= ps
                    continue
                
                res.append(str(nums[i]))
                visited[i] = True

                return backtrack(n, k, depth+1)
        
        return backtrack(n, k, 0)
