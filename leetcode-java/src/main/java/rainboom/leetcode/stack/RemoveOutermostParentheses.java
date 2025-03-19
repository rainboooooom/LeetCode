package rainboom.leetcode.stack;

/**
 * 1021. 删除最外层的括号
 * 
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。
 * 例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * 
 * @author RainbomSea
 *
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
    	StringBuilder result = new StringBuilder();
    	char[] charArray = S.toCharArray();
    	int left = 1, right = 0;
    	for (int i = 1; i < charArray.length; i++) {
			if(charArray[i] == '(') {
				left++;
			} else {
				right++;
			}
			if(left != right) {
				result.append(charArray[i]);
			} else {
				i++; left = 1; right = 0;
			}
		}
		return result.toString();
    }
    
    public static void main(String[] args) {
    	String S = "(()())(())(()(()))";
		System.out.println(new RemoveOutermostParentheses().removeOuterParentheses(S));
	}
}
