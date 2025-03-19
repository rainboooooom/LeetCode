package rainboom.leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * 300. 最长递增子序列
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new LongestIncreasingSubsequence().lengthOfLIS(new int[]{});
        System.out.println(res);
    }
}
