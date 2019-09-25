package rainbomsea.leetcode.string;

import java.util.ArrayList;
import java.util.List;


/**
 *17. 电话号码的字母组合
 * 
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author RainbomSea
 *
 */
public class LetterCombinationsOfAPhoneNumber {
	
	List<String> result = new ArrayList<String>();
	String[] words = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
    public List<String> letterCombinations(String digits) {
		
    	if(digits.length() != 0) {
    		backtrack(digits, 0,  "");
    	}
    	return result;
    }

	private void backtrack(String digits, int level, String s) {
		if(level == digits.length()) {
			result.add(s);
			return ;
		}
		
		// 获取数字对应的字母数组索引
		int index = digits.charAt(level) - '0' - 2;
		
		for(int i = 0; i < words[index].length(); i++ ) {
			backtrack(digits, level + 1,  s + words[index].charAt(i));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
	}
}
