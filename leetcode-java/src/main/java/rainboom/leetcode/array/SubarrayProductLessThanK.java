package rainboom.leetcode.array;

/**
 * 713. 乘积小于 K 的子数组
 *
 * @Description: SubarrayProductLessThanK
 * @Author rainbomsea
 * @Date: 2022/5/5 10:57
 * @Version 1.0
 */
public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = i; j < nums.length; j++) {
                product *= nums[j];
                if(product >= k) {
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}
