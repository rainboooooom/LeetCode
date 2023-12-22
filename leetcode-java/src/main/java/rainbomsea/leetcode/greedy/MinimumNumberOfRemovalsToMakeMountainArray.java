package rainbomsea.leetcode.greedy;

import java.util.Arrays;

/**
 * 1671. 得到山形数组的最少删除次数
 */
public class MinimumNumberOfRemovalsToMakeMountainArray {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] pre = getLISArray(nums);
        int[] reversed = reverse(nums);
        int[] suf = getLISArray(reversed);
        suf = reverse(suf);

        int res = 0;
        for(int i = 0; i < n; i++) {
            if(pre[i] > 1 && suf[i] > 1) {
                res = Math.max(res, pre[i] + suf[i] - 1);
            }
        }
        res = n - res;
        return res;
    }

    private int[] getLISArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 0;  i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }

    private int[] reverse(int[] nums) {
        int n = nums.length;
        int[] reversed = new int[n];
        for(int i = 0; i < n; i++) {
            reversed[i] = nums[n - i - 1];
        }
        return reversed;
    }


}
