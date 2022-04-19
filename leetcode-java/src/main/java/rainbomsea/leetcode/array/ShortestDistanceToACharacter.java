package rainbomsea.leetcode.array;

/**
 *
 * 821. 字符的最短距离
 * 给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。
 * 返回一个整数数组 answer ，
 * 其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。
 * 两个下标 i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。
 *
 *
 * @Description: ShortestDistanceToACharacter
 * @Author rainbomsea
 * @Date: 2022/4/19 10:28
 * @Version  1.0
 */
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        // 右遍历, 一开始需要给一个 index 初始值
        int index = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
               index = i;
            }
            result[i] = i - index;
        }
        // 左遍历
        index = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                index = i;
            }
            result[i] = Math.min(result[i], index - i);
        }
        return result;
    }
}
