package rainbomsea.leetcode.string;


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	List<String> result = new ArrayList<String>();
	
    public List<String> generateParenthesis(int n) {
        int left = 0, right = 0;
    	backtrack(left, right, n, "");
        return result;
    }

	private void backtrack(int left, int right, int n, String s) {
		
		if(left == n && right == n) {
			result.add(s);
		}
		if(left < n) {
			backtrack(left+1, right, n, s + '(');
		}
		if(right < left) {
			backtrack(left, right+1, n, s + ')');
		}
	}
}
