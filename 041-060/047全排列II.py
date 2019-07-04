"""

给定一个可包含重复数字的序列，返回所有不重复的全排列。


"""

class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        visited = set()

        def backtrack(nums, temp):
            if len(nums) == len(temp):
                res.append(temp)

            for i in range(len(nums)):
                if i in visited or (i > 0 and i - 1 not in visited and nums[i-1] == nums[i]):
                    continue

                visited.add(i)
                backtrack(nums, temp + [nums[i]])
                visited.remove(i)

        backtrack(nums, [])
       
        return res

