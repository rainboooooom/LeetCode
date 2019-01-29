class Solution1:
    """
    暴力破解
    时间复杂度：o(n^2)
    空间复杂度：o(1)
    """
    
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i, a in enumerate(nums):
            for j, b in enumerate(nums[i+1:]):
                if (a + b == target):
                    return[i, j+i+1]

class Solution2:
    """
    字典
    时间复杂度：o(n)
    空间复杂度：o(n)
    """
    
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = dict()
        for i, a in enumerate(nums):
            value = target - a
            if(d.get(value) is not None):
                return [d.get(value), i]
            d[a] = i
                


if __name__=="__main__" :
    print(Solution1().twoSum([2, 7, 11, 15], 9))
    print(Solution2().twoSum([2, 7, 11, 15], 9))

