"""

假设按照升序排序的数组在预先未知的某个点上进行了旋转。

( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

你可以假设数组中不存在重复的元素。

你的算法时间复杂度必须是 O(log n) 级别。

"""

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        ans = -1

        if not nums:
            return ans

        start, end = 0, len(nums)-1
        
        while start + 1 < end:
            mid = (start + end) // 2            
            if nums[mid] >= nums[start]:
                if nums[start] <= target <= nums[mid]:
                    end = mid
                else:
                    start = mid

            else:
                if nums[mid] <= target <= nums[end]:
                    start = mid
                else:
                    end = mid
        
        if nums[start] == target:
            ans = start
        if nums[end] == target:
            ans = end
            
        return ans

