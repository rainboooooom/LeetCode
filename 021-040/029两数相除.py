"""

给定两个整数，被除数 dividend 和除数 divisor。

将两数相除，要求不使用乘法、除法和 mod 运算符.

"""


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        ans = 0
        a = abs(dividend)
        b = abs(divisor)

        for i in range(31, -1, -1):
            if a >> i >= b:
                ans += 1 << i
                a -= b << i

        if dividend ^ divisor < 0:
            return max(-2147483648, -ans)
        else:
            return min(2147483647, ans)



