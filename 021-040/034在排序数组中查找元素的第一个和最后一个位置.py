"""

给定一个按照升序排列的整数数组 nums，和一个目标值 target。

找出给定目标值在数组中的开始位置和结束位置。

"""

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first, last = -1, -1
        start, end = 0, len(nums) - 1
        while start <= end:
            mid = (start + end) // 2
            if nums[mid] < target:
                start = mid+1
            elif nums[mid] > target:
                end = mid-1
            else:
                first, last = mid, mid
                while first-1 >= 0 and nums[first-1] == target:
                    first -= 1
                while last+1 <= len(nums)-1 and nums[last+1] == target:
                    last += 1
                break

        return [first, last]
                


