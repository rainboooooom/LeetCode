package rainbomsea.leetcode.heap;

/**
 * 23. 合并K个排序链表
 * 
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * @author RainbomSea
 *
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length <= 0)
        	return null;
        
        return merge(lists, 0, lists.length-1);
    }

    public ListNode merge(ListNode[] lists, int left, int right) {
		if(left == right) 
			return lists[left];
		
		int mid = (left + right) >> 1;
		ListNode l1 = merge(lists, left, mid);
		ListNode l2 = merge(lists, mid+1, right);
		
		return mergeTwoLists(l1, l2);
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}
