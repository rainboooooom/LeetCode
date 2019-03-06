"""

请你来实现一个 atoi 函数，使其能将字符串转换成整数。

首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；

假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。

"""

class Solution:
    def myAtoi(self, str: str) -> int:
        str =  str.strip()
        if str == "":
            return 0
        d = {i:int(i) for i in '0123456789'}
        symbol = 1
        ans = 0
        if str[0] is '-':
            symbol = -1
        elif str[0] == '+':
            pass
        elif d.get(str[0]) is not None:
            ans = ans * 10 + d.get(str[0])
        else:
            return 0

        for i in str[1:]:
            if(d.get(i) is None):
                break
            ans = ans * 10 + d.get(i)

        ans *= symbol

        ans = min(2147483647, ans)
        ans = max(ans, -2147483648)

        return ans
