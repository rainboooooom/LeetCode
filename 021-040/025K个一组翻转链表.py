"""

给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。

"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        if k == 1 or not head:
            return head

        ans = ListNode(0)
        ans.next = head
        node = ans
       
        while node.next:
            l = node.next
            r = l
            count = 1
            while r.next and count < k:
                r = r.next
                count += 1
            
            if count < k:
                break
            
            tail = r.next
            p = l;
            q = p.next
            while q != tail:
                t = q.next
                q.next = p
                p = q
                q = t

            l.next = tail
            node.next = r
            node = l

        return ans.next
