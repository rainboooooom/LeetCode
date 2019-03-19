"""

给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

"""


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
       
        def backTrack(s='', left=0, right=0):
            if len(s) == 2 * n:
                res.append(s)
            
            if left < n:
                backTrack(s+'(', left+1, right)

            if right < left:
                backTrack(s+')', left, right+1)

        backTrack()

        return res
