package rainbomsea.leetcode.math;

/**
 * 7. 整数反转
 * 
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author RainbomSea
 *
 */
public class ReverseInteger {
    public int reverse(int x) {
    	int ans = 0;
    	while (x != 0) {
    		int a = x % 10;
    		if (ans > Integer.MAX_VALUE / 10 || a > 7 && ans == Integer.MAX_VALUE / 10) {
    			return 0;
    		} else if (ans < Integer.MIN_VALUE / 10 || a < -8 && ans < Integer.MIN_VALUE / 10) {
				return 0;
			}
    		ans = ans * 10 + a;
    		x /= 10;
    	}
    	
    	return ans;
    }
}
