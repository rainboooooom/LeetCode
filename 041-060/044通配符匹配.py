"""

给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。

"""

class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        len_s = len(s)
        len_p = len(p)
        
        # 初始化
        dp = [[False for _ in range(len_p+1)] for _ in range(len_s+1)]
        dp[0][0] = True

        for j in range(1, len_p + 1):
            if p[j-1] == '*':
                dp[0][j] = dp[0][j-1]
    
        # 动态规划
        for i in range(1, len_s + 1):
            for j in range(1, len_p + 1):
                if p[j-1] == '*':
                    dp[i][j] = dp[i-1][j] or dp[i][j-1]

                elif p[j-1] in (s[i-1], '?'):
                    dp[i][j] = dp[i-1][j-1]

        return dp[-1][-1]

                


