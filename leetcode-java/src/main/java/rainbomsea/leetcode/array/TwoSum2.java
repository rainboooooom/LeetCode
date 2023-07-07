package rainbomsea.leetcode.array;

import java.util.Arrays;

/**
 * @Description: TwoSum2
 * @Author rainbomsea
 * @Date: 2023/7/8 03:54
 * @Version 1.0
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if(target < numbers[left] + numbers[right]) {
                right--;
            } else if (target > numbers[left] + numbers[right]) {
                left++;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum2.twoSum(new int[]{-1, 0}, -1)));
    }
}
