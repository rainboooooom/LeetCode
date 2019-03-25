"""

给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

"""


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if len(nums) == 0:
            return 0

        ans = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[ans] = nums[i]
                ans += 1

        return ans
