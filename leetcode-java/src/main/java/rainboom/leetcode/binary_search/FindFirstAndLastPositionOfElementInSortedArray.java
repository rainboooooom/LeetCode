package rainboom.leetcode.binary_search;

import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right =  nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if(target == nums[mid]) {
                result[0] = result[1] = mid;
                while (result[0] - 1 >= 0 && nums[result[0] - 1] == target) {
                    result[0]--;
                }
                while (result[1] + 1 <= nums.length - 1 && nums[result[1] + 1] == target) {
                    result[1]++;
                }
                break;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] res = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, 8);
        System.out.println(Arrays.toString(res));
    }
}
