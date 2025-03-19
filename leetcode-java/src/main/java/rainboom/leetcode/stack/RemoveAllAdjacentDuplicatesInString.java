package rainboom.leetcode.stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * 
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * @author RainbomSea
 *
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
    	StringBuilder result = new StringBuilder();
    	int top = 0;
    	for(char c: S.toCharArray()) {
    		if(top != 0 && c == result.charAt(top-1)) {
    			result.deleteCharAt(--top);
    		} else {
    			result.append(c);
    			top++;
    		}
    	}
		return result.toString();
    }
}
