package rainboom.leetcode.dynamic_programming;

/**
 * 70. 爬楼梯
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                result[i] = 1;
            }else if(i == 1) {
                result[i] = 2;
            }else {
                result[i] = result[i-1]+ result[i-2];
            }
        }
        return result[n-1];
    }
}
