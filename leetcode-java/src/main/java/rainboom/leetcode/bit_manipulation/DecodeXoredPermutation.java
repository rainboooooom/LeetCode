package rainboom.leetcode.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * 1734. 解码异或后的排列i
 * 
 * 给你一个整数数组 perm ，它是前 n 个正整数的排列，且 n 是个 奇数 。
 * 它被加密成另一个长度为 n - 1 的整数数组 encoded ，满足 encoded[i] = perm[i] XOR perm[i + 1] 。比方说，如果 perm = [1,3,2] ，那么 encoded = [2,1] 。
 * 给你 encoded 数组，请你返回原始数组 perm 。题目保证答案存在且唯一。
 *
 */
public class DecodeXoredPermutation {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int all = 1;
        for (int i = 2; i <= n; i++) {
            all ^= i;
        }
        int first = all;
        for (int i = 1; i < encoded.length; i += 2) {
            first ^= encoded[i];
        }
        int[] perm = new int[n];
        perm[0] = first;
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i-1] ^ encoded[i-1];
        }
        return perm;
    }
}
