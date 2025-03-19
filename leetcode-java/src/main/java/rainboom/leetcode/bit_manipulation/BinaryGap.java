package rainboom.leetcode.bit_manipulation;

/**
 * 868. 二进制间距
 *
 * @Description: BinaryGap
 * @Author rainbomsea
 * @Date: 2022/4/24 10:08
 * @Version 1.0
 */
public class BinaryGap {
    public int binaryGap(int n) {
        int ans = 0;
        int last = -1;
        for (int i = 0; n != 0; i++) {
            if( (n & 1) == 1) {
                if(last != -1) {
                    ans = Math.max(ans, i - last);
                }
                last = i;
            }
            n >>= 1;
        }
        return ans;
    }
}
