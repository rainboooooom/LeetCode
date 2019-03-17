"""

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

"""


class Solution:
    def isValid(self, s: str) -> bool:
        d = {')':'(', '}':'{', ']':'['}
        p = []
        for v in s:
            if v == '(' or v == '{' or v == '[':
                p.append(v)
            else:
                if len(p) == 0 or d.get(v) != p.pop():
                    return False
      
        return len(p) == 0
