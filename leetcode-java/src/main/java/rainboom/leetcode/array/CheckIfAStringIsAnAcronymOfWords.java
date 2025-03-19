package rainboom.leetcode.array;

import java.util.List;

/**
 * 2828. 判别首字母缩略词 </p>
 *
 * 给你一个字符串数组 words 和一个字符串 s ，请你判断 s 是不是 words 的 首字母缩略词 。</P>
 * 如果可以按顺序串联 words 中每个字符串的第一个字符形成字符串 s ，
 * 则认为 s 是 words 的首字母缩略词。例如，"ab" 可以由 ["apple", "banana"] 形成，
 * 但是无法从 ["bear", "aardvark"] 形成。</P>
 *
 * 如果 s 是 words 的首字母缩略词，返回 true ；否则，返回 false 。</P>
 */
public class CheckIfAStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        // 长度不等 直接 返回false
        if(words.size() != s.length()) return false;
        // 轮询比较
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != words.get(i).charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
