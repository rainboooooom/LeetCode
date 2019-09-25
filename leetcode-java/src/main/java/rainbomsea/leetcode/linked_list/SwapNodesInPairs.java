package rainbomsea.leetcode.linked_list;

/**
 * 24. 两两交换链表中的节点
 * 
 *	 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @author RainbomSea
 *
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
		ListNode ans = new ListNode(0);
		ans.next = head;
		ListNode node = ans;

    	while(node.next != null && node.next.next != null){
    		ListNode left = node.next;
    		ListNode right = node.next.next;
    		
    		node.next = right;
    		left.next = right.next;
    		right.next = left;
    		node = left;
    	}
    	return ans.next;
    }
    
    /**
     * 递归解法
     * @param head
     * @return
     */
    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
