package rainboom.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * 
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 *左括号必须用相同类型的右括号闭合。
 *左括号必须以正确的顺序闭合。
 *注意空字符串可被认为是有效字符串。
 * @author RainbomSea
 *
 */
public class ValidParentheses {
    public boolean isValid(String s) {
    	char[] charArray = s.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
    	Map<Character, Character> map = new HashMap<Character, Character>();
    	map.put('(', ')');
    	map.put('[', ']');
    	map.put('{', '}');
    	
    	for (int i = 0; i < charArray.length; i++) {
    		Character c = charArray[i];
			if(c == '(' || c == '[' || c == '{') {
				stack.add(c);
			} else {
				if(stack.isEmpty() || map.get(stack.pop()) != c) 
					return false;
			}
		}
    	
    	return stack.isEmpty();
    }
}
