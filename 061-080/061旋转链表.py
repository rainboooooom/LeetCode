"""

给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if not head:
            return None
        
        node = head
        L = 1
        while node.next:
            L += 1
            node = node.next

        node.next = head
        k = k % L
        node = head
        for i in range(L - k - 1):
            node = node.next

        res = node.next
        node.next = None

        return res

