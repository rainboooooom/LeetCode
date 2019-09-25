package rainbomsea.leetcode.math;

/**
 * 9. 回文数
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author RainbomSea
 *
 */
public class PalindromeNumber {
	
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10  == 0))
        	return false;
        
        int num = 0;
        while (num < x) {
			num = num * 10 + x % 10;
			x /=  10;
		}
    	return x == num || x == num / 10;
    }
    
    public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(12321));
	}
}
