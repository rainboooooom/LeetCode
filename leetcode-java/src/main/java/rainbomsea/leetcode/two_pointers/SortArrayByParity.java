package rainbomsea.leetcode.two_pointers;

/**
 * 905. 按奇偶排序数组
 *
 * 给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
 *
 * 返回满足此条件的 任一数组 作为答案。
 *
 * @Description: SortArrayByParity
 * @Author rainbomsea
 * @Date: 2022/4/28 10:37
 * @Version 1.0
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (right > left && nums[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
               int temp = nums[left];
               nums[left] = nums[right];
               nums[right] = temp;
               left++;
               right--;
            }
        }
        return nums;
    }
}
