package rainbomsea.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1190. 反转每对括号间的子串
 *
 * 给出一个字符串 s（仅含有小写英文字母和括号）。
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * 注意，您的结果中 不应 包含任何括号。
 *
 * @author rainbomsea
 */
public class ReverseSubstringsBetweenEachPairOfParentheses{

    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Deque<String> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(result.toString());
                result.setLength(0);
            } else if (ch == ')') {
                result.reverse();
                result.insert(0, stack.pop());
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
