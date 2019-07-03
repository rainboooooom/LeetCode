"""

给定一个没有重复数字的序列，返回其所有可能的全排列

"""

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        
        def backtrack(nums, temp):
            if not nums:
                res.append(temp)
                return 

            for i in range(len(nums)):
                backtrack(nums[:i] + nums[i+1:], temp+[nums[i]])
    
        backtrack(nums, [])
    
        return res



