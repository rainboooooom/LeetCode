package rainboom.leetcode.linked_list;
/**
 *160. 相交链表
 * 
 * 编写一个程序，找到两个单链表相交的起始节点。
 * @author RainbomSea
 *
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode p1 = headA, p2 = headB;
    	while(p1 != p2) {
    		p1 = p1 == null ? headB : p1.next;
    		p2 = p2 == null ? headA : p2.next;
    	}
		return p1;
    }
}
