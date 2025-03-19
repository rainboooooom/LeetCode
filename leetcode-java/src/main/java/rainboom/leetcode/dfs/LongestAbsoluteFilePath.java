package rainboom.leetcode.dfs;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 388. 文件的最长绝对路径
 * @Description: LongestAbsoluteFilePath
 * @Author rainbomsea
 * @Date: 2022/4/20 10:04
 * @Version 1.0
 */
public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        int n = input.length();
        int index = 0;
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        while (index < n) {
            // 记录当前节点的深度
            int depth = 1;
            while (index < n && input.charAt(index) == '\t') {
                index++;
                depth++;
            }
            // 记录当前节点长度
            int len = 0;
            boolean isFile = false;
            while (index < n && input.charAt(index) != '\n') {
                if(input.charAt(index) == '.') {
                    isFile = true;
                }
                index++;
                len++;
            }
            // 跳过 \n
            index++;

            while (stack.size() >= depth) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                len += stack.peek() + 1;
            }
            if(isFile) {
                ans = Math.max(ans, len);
            } else {
                stack.push(len);
            }
        }
        return ans;
    }
}
