"""

合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        temp = []
        ans = ListNode(0)
        node = ans
        for x in lists:
            p = x
            while p:
                temp.append(p.val)
                p = p.next

        temp.sort()
        
        for v in temp:
            node.next = ListNode(v)
            node = node.next

        node.next = None

        return ans.next
