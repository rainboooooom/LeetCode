package rainbomsea.leetcode.string;

/**
 * 58. 最后一个单词的长度
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * @author RainbomSea
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        char[] charArray = s.trim().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                break;
            }
            ans++;
        }
        return ans;
    }
}
