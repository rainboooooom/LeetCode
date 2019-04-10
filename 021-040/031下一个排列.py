"""

200~实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。

"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        flag = False

        for i in range(len(nums)-1, 0, -1):
            if nums[i] > nums[i-1]:
                flag = True
                for j in range(len(nums)-1, i-1, -1):
                    if nums[j] > nums[i-1]:
                        nums[i-1], nums[j] = nums[j], nums[i-1]
                        break

                nums[i:] = nums[i:][::-1]

                break
        
        if not flag:
            nums[::] = nums[::-1]
