package rainboom.leetcode.array;

/**
 * 509. 斐波那契数
 * 
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 * @author RainbomSea
 *
 */
public class FibonacciNumber {
    public int fib(int n) {
    	if(n == 0 || n == 1) {
    		return n;
    	} else {
    		return fib(n-1) + fib(n-2);
    	}
    }
}
