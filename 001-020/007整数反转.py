"""

给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

"""

class Solution:
    def reverse(self, x: int) -> int:
        a = abs(x)
        ans = int(str(a)[::-1])

        if x < 0:
            ans =  ans * -1

        if ans < -2**31 or ans > 2**31-1:
            return 0

        return ans
