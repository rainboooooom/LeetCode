package rainboom.leetcode.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * 
 * 给定两个数组，编写一个函数来计算它们的交集。
 * @author RainbomSea
 *
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> set1 = new HashSet<Integer>();
    	for (int i : nums1) {
			set1.add(i);
		}
    	Set<Integer> set2 = new HashSet<Integer>();
    	for (int i : nums2) {
			set2.add(i);
		}
    	
    	set1.retainAll(set2);
    	
    	int index = 0;
    	int[] result = new int[set1.size()];
    	for (Integer i : set1) {
			result[index++] = i;
		}
    	
		return result;
    }
}
