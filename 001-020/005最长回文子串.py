"""

给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

"""

class Solution:
    def longestPalindrome(self, s: str) -> str:
        if s == "":
            return ""

        start ,end = 0, 0 # 记录最长回文串的开始和结束位置
        for i in range(len(s)):
            length = max(expandAroundCenter(s, i, i), expandAroundCenter(s, i, i+1))
            if (length > end-start):
                start = i - (length-1) // 2
                end = i + length // 2

        return s[start: end+1]



def expandAroundCenter(s: str, left: int, right: int) -> int:
    i, j = left, right
    while (i >= 0 and j < len(s) and s[i] == s[j]):
        i = i - 1
        j = j + 1

    return j - i - 1
