package rainboom.leetcode.array;

/**
 * 53. 最大子序和
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @author RainbomSea
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(num, num + sum);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
