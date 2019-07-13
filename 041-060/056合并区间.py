"""

给出一个区间的集合，请合并所有重叠的区间。

"""

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals)
        res = []
        i = 0

        while i < len(intervals):
            left = intervals[i][0]
            right = intervals[i][1]

            while i < len(intervals) - 1 and intervals[i+1][0] <= right:
                i += 1
                right = max(right, intervals[i][1])

            res.append([left, right])
            i += 1

        return res 
            
    
