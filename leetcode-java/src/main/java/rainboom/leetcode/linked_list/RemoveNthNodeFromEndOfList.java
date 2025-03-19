package rainboom.leetcode.linked_list;

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
		int len = 0;
		ListNode ans =new ListNode(0);
		ans.next = head;
		while(head != null) {
			len++;
			head = head.next;
		}
        ListNode node = ans;
        for(int i = 0; i < len-n; i++){
            node = node.next;
        }
        node.next = node.next.next;
    	return ans.next;
    }
}
