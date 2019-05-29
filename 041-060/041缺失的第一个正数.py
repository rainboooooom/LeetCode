"""

给定一个未排序的整数数组，找出其中没有出现的最小的正整数。

"""

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        num_dict = {}
        
        for val in nums:
            num_dict[val] = 1
        
        i = 1
        while i:
            if(num_dict.get(i) is None):
                return i
            
            i += 1
