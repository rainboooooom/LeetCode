package rainboom.leetcode.dynamic_programming;

/**
 * 5. 最长回文子串
 * 
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * @author RainbomSea
 *
 */
public class LongestPalindromicSubstring {
	
	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		
		int[] range = new int[] {0, 0};
		
		boolean[][] dp = new boolean[s.length()][s.length()];
		
		for (int r = 1; r < dp.length; r++) {
			for (int l = 0; l < r; l++) {
				if(s.charAt(r) == s.charAt(l) && ((r-l <= 2) || dp[l+1][r-1])) {
					dp[l][r] = true;
					if (r - l >= range[1] - range[0]) {
						range[0] = l;
						range[1] = r;
					}
				}
			}
		}
		
    	return s.substring(range[0], range[1] + 1);
    }
   
}
