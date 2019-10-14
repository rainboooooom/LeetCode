package rainbomsea.leetcode.linked_list;

/**
 *
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode node = ans;
        while (head != null) {
            boolean flag = false;
            while (head != null && head.next != null && head.val == head.next.val) {
                head = head.next;
                flag = true;
            }
            if(!flag) {
                node.next = head;
                node = node.next;
            }
            head = head.next;
        }
        node.next = null;
        return ans.next;
    }
}
