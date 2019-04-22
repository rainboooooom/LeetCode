"""

给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。

"""

class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return '1'
        if n == 2:
            return '11'

        pre = '11'
        for i in range(3, n+1):
            res = ''
            count = 1
            for j in range(1, len(pre)):
                if pre[j-1] == pre[j]:
                    count += 1
                else:
                    res += str(count) + pre[j-1]
                    count = 1

            res += str(count) + pre[j]
            pre = res

        return res
