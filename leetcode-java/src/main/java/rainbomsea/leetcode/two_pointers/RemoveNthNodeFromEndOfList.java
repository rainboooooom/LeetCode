package rainbomsea.leetcode.two_pointers;

/**
 * 
 * 19. 删除链表的倒数第N个节点
 * 
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author RainbomSea
 *
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode ans =new ListNode(0);
    	ans.next = head;
    	ListNode move = head;
    	ListNode node = ans;
    	
    	for(int i = 0;  i <= n; i++) {
    		move = move.next;
    	}
    	
    	while(move != null) {
    		move = move.next;
    		node = node.next;
    	}
    	node.next = node.next.next;
    	
    	return ans.next;
    }
}
