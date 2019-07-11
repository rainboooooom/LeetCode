"""

给定一个整数数组 nums ，

找到一个具有最大和的连续子数组（子数组最少包含一个元素），

返回其最大和。

"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        ans = nums[0]
        sum_n  = 0

        for num in nums:
            if sum_n > 0:
                sum_n += num
            else:
                sum_n = num

            ans = max(sum_n, ans)

        return ans
