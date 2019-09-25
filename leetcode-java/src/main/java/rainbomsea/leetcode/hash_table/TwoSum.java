package rainbomsea.leetcode.hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @author RainbomSea
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				return new int[] {map.get(temp), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9)));
	}
}
