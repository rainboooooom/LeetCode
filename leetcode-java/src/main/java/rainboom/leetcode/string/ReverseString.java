package rainboom.leetcode.string;

/**
 * 344. 反转字符串
 * 
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 
 * @author RainbomSea
 *
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while(left < right) {
        	char temp = s[left];
        	s[left++] = s[right];
        	s[right--] = temp;
        }
    }
}
