package rainbomsea.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 824. 山羊拉丁文
 * 给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。
 *
 * 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文- Pig Latin 的虚构语言）。山羊拉丁文的规则如下：
 *
 * 如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
 * 例如，单词 "apple" 变为 "applema" 。
 * 如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词 "goat" 变为 "oatgma" 。
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
 * 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。
 * 返回将 sentence 转换为山羊拉丁文后的句子。
 *
 * @Description: GoatLatin
 * @Author rainbomsea
 * @Date: 2022/4/21 10:14
 * @Version 1.0
 */
public class GoatLatin {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};
        StringBuilder result = new StringBuilder();
        int len = sentence.length();
        int count = 0;
        int i = 0;
        while (i < len) {
            int j = i;
            while (j < len && sentence.charAt(j) != ' ') {
                j++;
            }
            count++;
            // 第一个单词前面不需要加空格，其他都加
            if (count != 1) {
               result.append(' ');
            }
            if(vowels.contains(sentence.charAt(i))) {
                result.append(sentence, i, j);
            } else {
                result.append(sentence, i+1, j);
                result.append(sentence.charAt(i));
            }
            result.append('m');
            // count 为单词的索引值，从1开始, k < count + 1 是把上面的 'ma' 的 'a'一起放下面添加
            for(int k = 0; k < count + 1; k++) {
                result.append('a');
            }
            i = j + 1;
        }
        return result.toString();
    }
}
