package rainbomsea.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. 下一个更大元素 I 
 * 
 * 给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
 * @author RainbomSea
 *
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Map<Integer, Integer> hasMap = new HashMap<Integer, Integer>();
    	Stack<Integer> stack = new Stack<>();
    	int[] result = new int[nums1.length];
    	
    	for(int num:nums2) {
    		while(!stack.isEmpty() && num > stack.peek()) {
    			hasMap.put(stack.pop(), num);
    		}
    		stack.push(num);
    	}
    	
    	for(int i = 0; i < nums1.length; i++) 
    		result[i] = hasMap.getOrDefault(nums1[i], -1);

    	
		return result;
    }
}
