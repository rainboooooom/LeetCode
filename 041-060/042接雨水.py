"""

给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

"""

class Solution:
    def trap(self, height: List[int]) -> int:
        ans = 0
        left, right = 0, len(height)-1
        left_max, right_max = 0, 0
        
        while left < right:
            if height[left] < height[right]:
                if left_max < height[left]:
                    left_max = height[left]
                else:
                    ans += left_max-height[left]

                left += 1
            else:
                if right_max < height[right]:
                    right_max = height[right]
                else:
                    ans += right_max-height[right]

                right -= 1

        return ans

        
