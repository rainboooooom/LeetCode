package rainboom.leetcode.math;

/**
 * 8. 字符串转换整数 (atoi)
 * 
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * 
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−2^31,  2^31 − 1]。如果数值超过这个范围，请返回  INT_MAX (2^31 − 1) 或 INT_MIN (−2^31) 。
 * @author RainbomSea
 *
 */
public class StringToIntegerAtoi {
    public int myAtoi(String str) {
    	str = str.trim();
    	if(str == null || str.length() < 1) {
    		return 0;
    	}
		char[] charArray = str.toCharArray();
		int symbol = 1;
		int ans = 0;
		
		if(charArray[0] == '-') {
			symbol = -1;
		}else if (charArray[0] == '+') {
			symbol = 1;
		}else if (charArray[0] >= '0' && charArray[0] <= '9') {
			ans += charArray[0] - '0';
		} else {
			return 0;
		}
		
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				int temp = ans * symbol;
				if(temp > Integer.MAX_VALUE / 10 || temp == Integer.MAX_VALUE / 10 && charArray[i]-'0' > 7)
					return Integer.MAX_VALUE;
				else if (temp < Integer.MIN_VALUE / 10 || temp == Integer.MIN_VALUE / 10 && charArray[i]-'0' > 8 ) {
					return Integer.MIN_VALUE;
				}
				
				ans = ans * 10 + charArray[i] - '0';
			}else {
				break;
			}
		}
		
    	return ans * symbol;
    }
    
    public static void main(String[] args) {
		System.out.println(new StringToIntegerAtoi().myAtoi("-91283472332"));
	}
}
