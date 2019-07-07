"""

给定一个字符串数组，将字母异位词组合在一起。

字母异位词指字母相同，但排列不同的字符串。

"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        from collections import defaultdict

        res  = defaultdict(list)

        for s in strs:
            res[''.join(sorted(s))].append(s)

        return res.values()
