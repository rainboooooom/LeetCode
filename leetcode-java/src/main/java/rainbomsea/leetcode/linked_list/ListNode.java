package rainbomsea.leetcode.linked_list;

public class ListNode {
	int val;
	ListNode next;
	
	public ListNode(int x) {
		this.val = x;
	}

	@Override
	public String toString() {
		return val + "->" + next;
	}
}
