"""

给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

"""

class Solution:
    def intToRoman(self, num: int) -> str:

        res = ''
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        roman = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
       
        for i, v in enumerate(values):
            a = num // v
            if a > 0:
                num = num % v
                res = res + roman[i] * a
        
        return res
        
