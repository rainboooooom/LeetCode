"""

给定一个无重复元素的数组 candidates 和一个目标数 target ，

找出 candidates 中所有可以使数字和为 target 的组合。

"""

class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        if target == 0:
            return [[]]
        elif not candidates or target < min(candidates):
            return []

        res = []
        for i in candidates:
            for j in self.combinationSum(list(filter(lambda x: x <= i, candidates)), target-i):
               res.append([i] + j)

        return res
