package rainbomsea.leetcode.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 15. 三数之和
 * 
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 
 * @author RainbomSea
 *
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums.length < 3)
			return result;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0)
				break;
			if(i > 0 && nums[i] == nums[i-1])
				continue;
			int left = i + 1;
			int right = nums.length - 1;
			while(left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				if(sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while(left < right && nums[left] == nums[left+1])
						left++;
					while(right > left && nums[right] == nums[right-1])
						right--;
					left++;
					right--;
				}else if(sum < 0) {
					left++;
				}else {
					right--;
				}
			}
		}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.println(new ThreeSum().threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
	}
}
