"""

给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

"""

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        last = len(s)-1

        while last >= 0 and s[last] == " ":
            last -= 1

        if last < 0:
            return 0

        first = last
        while first >= 0 and s[first] != " ":
            first -= 1

        return last - first
