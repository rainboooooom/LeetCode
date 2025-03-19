package rainboom.leetcode.array;

/**
 * 66. 加一
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author RainbomSea
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = null;
        for (int i = digits.length-1; i >= 0; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        // 如果是 99 , 999 这种特殊情况,所以要扩充数组长度
        result = new int[digits.length + 1];
        result[0] = 1;// 给数组第一位赋值为1,其他默认为0
        return result;
    }
}
