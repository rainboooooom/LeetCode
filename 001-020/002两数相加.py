"""

给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        result = ListNode(0)
        re = result # 用另一个变量来操作, result 用来记住链表头
        carry = 0

        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            num = carry + x + y
            carry = num // 10
            re.next = ListNode(num % 10)
            re = re.next
            if l1 != None:
                l1 = l1.next
            if l2 != None:
                l2 = l2.next

        if carry > 0: # 如何最高位相加大于10， 就向前进1
            re.next = ListNode(1)
            re = re.next

        return result.next
