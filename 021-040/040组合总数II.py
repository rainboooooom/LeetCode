"""

给定一个数组 candidates 和一个目标数 target ，

找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的每个数字在每个组合中只能使用一次。

"""

class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        if not candidates:
            return []

        candidates.sort()
        L = len(candidates)
        res = []

        def backtrack(i, tmp_sum, tmp_list):
            if tmp_sum == target:
                res.append(tmp_list)
                return

            for j in range(i, L):
                if tmp_sum + candidates[j] > target:
                    break
                if j > i and candidates[j] == candidates[j-1]:
                    continue
                backtrack(j + 1, tmp_sum + candidates[j], tmp_list + [candidates[j]])

        backtrack(0, 0, [])

        return res

