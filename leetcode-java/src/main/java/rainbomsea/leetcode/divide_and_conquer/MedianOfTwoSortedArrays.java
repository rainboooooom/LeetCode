package rainbomsea.leetcode.divide_and_conquer;

/**
 *  4. 寻找两个有序数组的中位数
 * 
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * @author RainbomSea
 *
 */
public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		if (len1 > len2) {
			return findMedianSortedArrays(nums2, nums1);
		}
		
		int left = 0;
		int right = len1;
		
		while (left < right) {
			int m = (left + right) / 2;
			int n = (len1 + len2 + 1) / 2 - m;
			
			if (nums1[m] < nums2[n-1]) {
				left =  m + 1;
			} else {
				right = m;
			}
		}
		
		int m = left;
		int n = (len1 + len2 + 1) / 2 - m;
        
		int a1 = Math.max(m <= 0 ? Integer.MIN_VALUE : nums1[m-1],
						n <= 0 ? Integer.MIN_VALUE :  nums2[n-1]);
		
		if ((len1 + len2) % 2 == 1)
			return a1;
		
		int a2 = Math.min(m >= len1? Integer.MAX_VALUE:nums1[m],
						n >= len2? Integer.MAX_VALUE:nums2[n]);
		
		return (a1 + a2) * 0.5;
    }
}
