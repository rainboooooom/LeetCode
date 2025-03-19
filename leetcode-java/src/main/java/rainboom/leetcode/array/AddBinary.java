package rainboom.leetcode.array;

/**
 * 67. 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (m >= 0 || n >= 0) {
            int sum = carry;
            sum += m >= 0 ? a.charAt(m--) - '0' : 0;
            sum += n >= 0 ? b.charAt(n--) - '0' : 0;
            carry = sum / 2;
            result.append(sum % 2);
        }
        // 处理进位问题
        result.append(carry == 0 ? "" : carry);
        return result.reverse().toString();
    }
}
