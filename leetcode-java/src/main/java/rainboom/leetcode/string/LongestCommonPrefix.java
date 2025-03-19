package rainboom.leetcode.string;

/**
 * 14. 最长公共前缀
 * 
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * @author RainbomSea
 *
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) 
    		return "";
    	
    	String result = strs[0];
    	
    	for (int i = 0; i < strs.length; i++) {
    		int j = 0;
    		for(; j < result.length() && j < strs[i].length(); j++) {
    			if(result.charAt(j) != strs[i].charAt(j)) 
    				break;
    		}
    		result = strs[0].substring(0, j);
		}
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	
    	String[] strs = new String[]{"flower", "flow", "flight"};
    
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
	}
}
