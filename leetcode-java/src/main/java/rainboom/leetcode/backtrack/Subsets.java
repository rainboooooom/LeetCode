package rainboom.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Subsets {

    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, nums);
        return result;
    }

    private void backtrack(int cur, int[] nums) {
        if (cur == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[cur]);
        backtrack(cur+1, nums);
        temp.remove(temp.size()-1);
        backtrack(cur+1, nums);
    }
}
