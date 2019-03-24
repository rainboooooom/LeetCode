"""

给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

"""


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if(len(nums) == 0):
            return 0

        ans = 0

        for i in range(1, len(nums)):
            if nums[i] != nums[ans]:
                nums[ans+1] = nums[i]
                ans += 1
        
        return ans+1
