package rainbomsea.leetcode.linked_list;

/**
 * 2. 两数相加
 * 
 * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @author RainbomSea
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode(0);
		ListNode node = ans;
		int carray = 0;
		
		while (l1 != null || l2 != null) {
			int x = l1 == null ? 0: l1.val;
			int y = l2 == null ? 0: l2.val;
			
			node.next = new ListNode((x + y + carray) % 10);
			node = node.next;
			carray = (x + y + carray) / 10;
			
			l1 = l1 == null ? l1: l1.next;
			l2 = l2 == null ? l2: l2.next;
		}
		
		if (carray > 0) {
			node.next = new ListNode(1);
			node = node.next;
		}
		node.next = null;
		
		return ans.next;
	}
}