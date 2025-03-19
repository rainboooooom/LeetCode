package rainboom.leetcode.tree;

public class NodeII {
    public int val;
    public NodeII left;
    public NodeII right;
    public NodeII next;

    public NodeII() {}

    public NodeII(int _val) {
        val = _val;
    }

    public NodeII(int _val, NodeII _left, NodeII _right, NodeII _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
