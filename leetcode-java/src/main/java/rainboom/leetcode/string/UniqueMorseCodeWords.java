package rainboom.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 * 
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。 返回我们可以获得所有词不同单词翻译的数量。
 * 
 * @author RainbomSea
 *
 */
public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
		String[] dict = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> set = new HashSet<String>();
		for (String word : words) {
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < word.length(); i++) {
				result.append(dict[word.charAt(i) - 'a']);
			}
			set.add(result.toString());
		}
		return set.size();
	}
}
