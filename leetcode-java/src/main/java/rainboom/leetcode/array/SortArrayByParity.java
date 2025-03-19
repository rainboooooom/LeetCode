package rainboom.leetcode.array;

/**
 * 905. 按奇偶排序数组
 * 
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * @author RainbomSea
 *
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
    	int[] result = new int[A.length];
    	int i = 0;
    	for (int val : A) {
			if(val % 2 == 0) {
				result[i++] = val;
			}
		}
    	for (int val : A) {
			if(val % 2 != 0) {
				result[i++] = val;
			}
		}
    	return result;
    }
}
