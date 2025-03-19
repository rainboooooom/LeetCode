package rainboom.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * 2866. 美丽塔 II
 */
public class BeautifulTowers2 {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res= 0;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        Deque<Integer> preStack = new ArrayDeque<>();
        Deque<Integer> sufStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!preStack.isEmpty() && maxHeights.get(i) < maxHeights.get(preStack.peek())) {
                preStack.pop();
            }
            if (preStack.isEmpty()) {
                prefix[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                prefix[i] = prefix[preStack.peek()] + (long) (i - preStack.peek()) * maxHeights.get(i);
            }
            preStack.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!sufStack.isEmpty() && maxHeights.get(i) < maxHeights.get(sufStack.peek())) {
                sufStack.pop();
            }
            if(sufStack.isEmpty()) {
                suffix[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                suffix[i] = suffix[sufStack.peek()] + (long) (sufStack.peek() - i) * maxHeights.get(i);
            }
            sufStack.push(i);
            res = Math.max(res, prefix[i] + suffix[i] - maxHeights.get(i));
        }

        return res;
    }
}
