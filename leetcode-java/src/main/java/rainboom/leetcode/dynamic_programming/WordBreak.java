package rainboom.leetcode.dynamic_programming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139. 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，
 * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * @author RainbomSea
 *
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
    	Set<String> wordSet = new HashSet(wordDict);
    	boolean[] dp = new boolean[s.length() + 1];
    	dp[0] = true;
    	for(int i = 1; i <= s.length(); i++) {
    		for(int j = 0;  j < i; j++) {
    			if(dp[j] && wordSet.contains(s.substring(j, i))) {
    				dp[i] = true;
    				break;
    			}
    		}
    	}
    	return dp[s.length()];
    }
}
