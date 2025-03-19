package rainboom.leetcode.linked_list;

/**
 * 61. 旋转链表
 *
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode ans;
        ListNode node = head;
        int len = 1;
        while (node.next != null) {
            len++;
            node = node.next;
        }
        // 尾指针指向头指针形成环
        node.next = head;

        k = k % len;
        for (int i = 0; i < len - k; i++) {
            node = node.next;
        }
        ans = node.next;
        node.next = null;
        return ans;
    }
}
