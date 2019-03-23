"""

给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        ans = ListNode(0)
        ans.next = head
       
        p = ans
        while p.next and p.next.next:
            node_1 = p.next
            node_2 = p.next.next
            node_3 = node_2.next

            p.next = node_2
            node_1.next = node_3
            node_2.next = node_1
            p = p.next.next

        return ans.next


