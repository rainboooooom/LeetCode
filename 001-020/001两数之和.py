"""

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

"""
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = dict()
        for i, a in enumerate(nums):
            value = target - a
            if(d.get(value) is not None):
                return [d.get(value), i]
            d[a] = i
