package rainboom.leetcode.bit_manipulation;

/**
 * 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），
 * 返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *
 * @author rainbomsea
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0) {
            n &= n - 1;
            ans++;
        }
        return ans;
    }
}
