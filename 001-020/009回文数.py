"""

判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

"""

class Solution:
    def isPalindrome(self, x: int) -> bool:

        if x < 0 or x % 10 == 0 and x is not 0:
            return False

        reverse_x = 0
        while x > reverse_x:
            reverse_x = reverse_x * 10 + x % 10
            x = x // 10

        return x == reverse_x or x == reverse_x // 10
