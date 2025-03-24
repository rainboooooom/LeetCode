package rainboom.leetcode.array;


/**
 * 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int count = 0;
        int start = -1;
        while (count < len) {
            start++;
            int current = start;
            int prev = nums[current];
            do {
                int next = (current + k) % len;
                int temp  = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (current != start);
        }
    }
}
