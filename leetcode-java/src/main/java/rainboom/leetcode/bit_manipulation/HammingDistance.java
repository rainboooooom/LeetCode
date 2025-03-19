package rainboom.leetcode.bit_manipulation;

/**
 * 461. 汉明距离
 * 
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * @author RainbomSea
 *
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
    	int ans = 0;
    	int n = x ^ y;
    	while(n != 0) {
    		n &= n - 1;
    		ans ++;
    	}
        return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(new HammingDistance().hammingDistance(1, 4));
	}
}
