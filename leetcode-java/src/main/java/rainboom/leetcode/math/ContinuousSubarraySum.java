package rainboom.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. 连续的子数组和
 *
 * 给你一个整数数组 nums 和一个整数 k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：
 *
 * 子数组大小至少为 2 ，且子数组元素总和为 k 的倍数。
 *
 * 如果存在，返回 true ；否则，返回 false 。
 */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // 考虑某个前缀和就是k的倍数
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = (temp + nums[i]) % k;
            if (map.containsKey(temp)) {
                int index = map.get(temp);
                if(i - index >= 2) {
                    return true;
                }
            } else {
                map.put(temp, i);
            }
        }
        return false;
    }
}
