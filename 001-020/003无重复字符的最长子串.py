"""

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

"""

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = dict()
        ans, i = 0, 0 # i用来记录每次字符串的起始位置
        for j, value in enumerate(s):
            if d.get(value) is not None:
                i = max(d[value]+1, i)
            ans = max(ans, j-i+1)
            d[value] = j
        return ans
