package rainbomsea.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 386. 字典序排数
 * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。
 * 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。
 *
 * @Author rainbomsea
 * @Date: 2022/4/18 11:07
 * @Version 1.0
 */
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            result.add(number);
            if( number * 10 <= n) {
                number *= 10;
            } else {
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                number += 1;
            }
        }
        return result;
    }
}
