"""

给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。

"""

class Solution:
    def longestValidParentheses(self, s: str) -> int:
        a, b = [], [0] * len(s)
        for i, value in enumerate(s):
            if value == '(':
                a.append(i)
            elif a:
                b[a.pop()], b[i] = 1, 1
            
        max_num, temp = 0, 0
        for i in b:
            if i == 1:
                temp += 1
            else:
                max_num = max(temp, max_num)
                temp = 0

        return max(temp, max_num)

