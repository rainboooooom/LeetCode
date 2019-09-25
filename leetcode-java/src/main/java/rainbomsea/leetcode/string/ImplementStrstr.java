package rainbomsea.leetcode.string;

/**
 * 28. 实现 strStr()
 * 
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * @author RainbomSea
 *
 */
public class ImplementStrstr {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
