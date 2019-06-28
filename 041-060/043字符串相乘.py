"""

给定两个以字符串形式表示的非负整数 num1 和 num2，

返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

"""

class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == '0' or num2 == '0':
            return '0'

        l1, l2 = len(num1), len(num2)
        k = [0 for i in range(l1+l2)]
        num1, num2 = num1[::-1], num2[::-1]

        for i in range(l1):
            for j in range(l2):
                k[i+j] += int(num1[i]) * int(num2[j])

        for i in range(l1 + l2):
            if k[i] >= 10:
                k[i+1] += k[i] // 10
                k[i] = k[i] % 10

        res = "".join(str(x) for x in k[::-1])
        res = res.lstrip('0') # 去除前导0

        return res
