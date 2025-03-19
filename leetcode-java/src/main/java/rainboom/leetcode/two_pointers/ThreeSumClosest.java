package rainboom.leetcode.two_pointers;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 *找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。 
 * @author RainbomSea
 *
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		
    	int sum;
    	int left, right;
    	int ans = nums[0] + nums[1] + nums[2];
    	
    	for(int i = 0; i < nums.length; i++) {
    		left = i + 1;
    		right = nums.length - 1;
    		
    		while(left < right) {
    			sum = nums[i] + nums[left] + nums[right];
    			if(Math.abs(sum - target) <= Math.abs(ans-target)) {
    				ans = sum;
    			}
    			if(sum > target) {
    				right--;
    			} else if (sum < target) {
    				left ++;
    			} else {
    				return ans;
    			}
    		}
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[] {-1, 2, 1, -4}; 
    	
		System.out.println(new ThreeSumClosest().threeSumClosest(nums, 1));
	}
}
