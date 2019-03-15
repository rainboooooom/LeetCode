"""

给定一个包含 n 个整数的数组 nums 和一个目标值 target，
判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？
找出所有满足条件且不重复的四元组。

"""


class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        nums.sort()
        
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            for j in range(i+1, len(nums)):
                if j != i+1 and nums[j] == nums[j-1]:
                    continue

                l = j + 1
                r = len(nums) - 1

                while l < r:
                    s = nums[i] + nums[j] + nums[l] + nums[r]
                    if s == target:
                        res.append([nums[i], nums[j], nums[l], nums[r]])
                        l += 1
                        r -= 1
                        while l < r and nums[l-1] == nums[l]:
                            l += 1
                        while r > l and nums[r+1] == nums[r]:
                            r -= 1
                    elif s < target:
                        l += 1
                    else:
                        r -= 1

        return res

