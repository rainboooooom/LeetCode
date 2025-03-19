package rainboom.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 396. 旋转函数
 * @Description: RotateFunction
 * @Author rainbomsea
 * @Date: 2022/4/22 10:21
 * @Version 1.0
 */
public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int ans = 0;
        int f = 0;
        int len = nums.length;
        int sum = Arrays.stream(nums).sum();

        for(int i = 0; i < len; i++) {
            f += i * nums[i];
        }
        ans = f;
        for (int i = 1; i < len; i++ ) {
            f += sum - len * nums[len - i];
            ans = Math.max(ans, f);
        }
        return ans;
    }
}
