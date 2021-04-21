package rainbomsea.leetcode.string;

import java.util.Locale;

/**
 * 91. 解码方法
 *  一条包含字母 A-Z 的消息通过以下映射进行了编码 :
 *      'A' -> 1
 *      'B' -> 2
 *      ...
 *      'Z' -> 26
 *  要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。
 *  例如，"11106" 可以映射为：
 *      "AAJF" ，将消息分组为 (1 1 10 6)
 *      "KJF" ，将消息分组为 (11 10 6)
 *  注意，消息不能分组为  (1 11 06) ，因为 "06" 不能映射为 "F" ，这是由于 "6" 和 "06" 在映射中并不等价。
 *  给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数 。
 *  题目数据保证答案肯定是一个 32 位 的整数。
 *
 * @author rainbomsea
 */
public class DecodeWays {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if (s.length() >= 1 && chars[0] == '0') {
            return 0;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '0') {
                if( chars[i-1]  > '2' || chars[i-1] == '0') {
                    return 0;
                }
                dp[i] = i == 1 ? dp[0] : dp[i-2];
            } else if ( ((chars[i] - '0') + (chars[i-1] - '0') * 10 <= 26 ) && chars[i-1] > '0') {
                dp[i] = i == 1 ? 2 * dp[i-1] : dp[i-1] + dp[i-2];
            } else  {
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        System.out.println("".toCharArray());
    }
}
