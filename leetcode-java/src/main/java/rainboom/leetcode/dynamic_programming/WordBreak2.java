package rainboom.leetcode.dynamic_programming;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * 140. 单词拆分 II
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
 * 在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 * @author RainbomSea
 *
 */
public class WordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
    	Set<String> wordSet = new HashSet(wordDict);
    	List<String> result = new ArrayList<String>();
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
    	
    	if(dp[s.length()]) {
    		backtrack(s, s.length(), wordSet, new LinkedList<>(), dp, result);
    	}
    	return result;
    }
    
    public void backtrack(String s, int len, Set<String> wordSet, LinkedList<String> path, boolean[] dp, List<String> result) {
    	if(len == 0) {
    		result.add(String.join(" ", path));
    		return;
    	}
    	for(int i = len-1; i >= 0; i--) {
    		String temp = s.substring(i, len);
    		if(wordSet.contains(temp) && dp[i]) {
    			path.offerFirst(temp);
    			backtrack(s, i, wordSet, path, dp, result);
    			path.removeFirst();
    		}
    	}
    }
}
