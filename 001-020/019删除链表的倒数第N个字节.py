"""

给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        l = 0
        ans = ListNode(0)
        ans.next = head
        first = head
        while first:
            l += 1
            first = first.next
        
        l -= n
        first = ans
        while l:
            l -= 1
            first = first.next
        first.next = first.next.next

        return ans.next
            
            
