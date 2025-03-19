package rainboom.leetcode.string;

/**
 * 12. 整数转罗马数字
 * 
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * @author RainbomSea
 *
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
    	
    	int nums[] = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String romans[] = new String[]{"M", "CM", "D", "CD", "C", "XC","L", 
    			"XL", "X", "IX", "V", "IV", "I"};
    	StringBuilder result = new StringBuilder();
    	
    	int index = 0;
    	while(num > 0) {
    		while(num >= nums[index]) {
    			result.append(romans[index]);
    			num -= nums[index]; 
    		}
    		index ++;
    	}
    	
    	return result.toString();
    }

    public static void main(String[] args) {
		System.out.println(new IntegerToRoman().intToRoman(1994));
	}
}
