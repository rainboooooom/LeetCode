package rainboom.leetcode.math;


/**
 * 13. 罗马数字转整数
 * 
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * @author RainbomSea
 *
 */
public class RomanToInteger {
	
	public int getValue(char c) {
		switch(c) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;
		}
	}
	
    public int romanToInt(String s) {
		
    	int ans = 0;
    	char[] charArray = s.toCharArray();
    	
    	for(int i = 0; i < charArray.length; i++) {
    		int temp = this.getValue(charArray[i]);
    		if(i == charArray.length-1 || temp >= this.getValue(charArray[i+1])) {
    			ans += temp;
    		}else {
    			ans -= temp;
    		}
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
	}
}
