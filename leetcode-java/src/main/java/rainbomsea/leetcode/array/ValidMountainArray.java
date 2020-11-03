package rainbomsea.leetcode.array;

/**
 * 941. 有效的山脉数组
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 * @author RainbomSea
 *
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
    	int left = 0;
    	int right = A.length - 1;
    	while(left < right && A[left] < A[left+1]) {
    		left++;
    	}
    	while(right > 0 && A[right] < A[right-1]) {
    		right--;
    	}
    	if(left > 0 && right < A.length - 1 && left == right) {
    		return true;
    	}
    	return false;
    }
}
