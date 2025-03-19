package rainboom.leetcode.linked_list;

/**
 * 
 * 25. K 个一组翻转链表
 * 
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * @author RainbomSea
 *
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode ans = new ListNode(0);
    	ans.next = head;
    	ListNode pre = ans, tail = ans;
    	
    	while(true) {
    		int i = 0;
    		while(tail != null && i != k) {
    			i++;
    			tail = tail.next;
    		}
    		
    		if(tail == null) break;
    		
    		ListNode node = pre.next;
    		while(pre.next != tail) {
    			ListNode temp = pre.next;
    			pre.next = temp.next;
    			temp.next = tail.next;
    			tail.next = temp;
    		}
    		pre = node;
    		tail = node;
    	 }
    	return ans.next;
    }
    
    
    public static void main(String[] args) {
		ListNode l2 = new ListNode(0);
    	ListNode l1 = l2;
		for(int i = 1; i <= 5; i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		System.out.println(new ReverseNodesInKGroup().reverseKGroup(l2.next, 3));
	}
}
