package rainbomsea.leetcode.linked_list;

/**
 * 83. 删除排序链表中的重复元素
 * 
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @author RainbomSea
 *
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null && node.next != null) {
        	if(node.val == node.next.val) {
        		node.next = node.next.next;
        	} else {
        		node = node.next;
        	}
        }
        return head;
    }
}
