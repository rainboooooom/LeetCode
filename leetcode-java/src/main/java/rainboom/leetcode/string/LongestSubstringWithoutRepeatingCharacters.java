package rainboom.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * 
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author RainbomSea
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
		
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	int ans= 0;
    	int start = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (map.containsKey(c)) {
    			start = Math.max(start, map.get(c)+1);
			}
    		ans = Math.max(ans, i-start+1);
    		map.put(c, i);
		}

    	return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(
				new LongestSubstringWithoutRepeatingCharacters().
				lengthOfLongestSubstring(" ")
		);
	}
}
