"""

编写一个函数来查找字符串数组中的最长公共前缀
如果不存在公共前缀,返回空字符串 ""

"""

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ''
        if not len(strs):
            return res
        
        a = strs[0]
        flag = True

        for i in range(len(a)):
            for s in strs:
                if i < len(s) and s[i] == a[i]:
                    flag = True
                else:
                    flag = False
                    break
            if flag:
                res += a[i]
            else:
                break

        return res


