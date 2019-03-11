"""

给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

"""

class Solution:
    def romanToInt(self, s: str) -> int:
        ans = 0
        m = {'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5, 'I':1}
        
        for i in range(len(s)):
            if i < len(s)-1 and m[s[i]] < m[s[i+1]]:
                ans -= m[s[i]]
            else:
                ans += m[s[i]]

        return ans
