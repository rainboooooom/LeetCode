package rainbomsea.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 *
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 说明：
 *  1.所有数字（包括 target）都是正整数。
 *  2.解集不能包含重复的组合。 
 */
public class CombinationSum2 {

    List<List<Integer>> result;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        result = new ArrayList<>();
        // 排序, 减枝的前提
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>());

        return result;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> list){

        if(target == 0) {
            result.add(new ArrayList<>(list));
            return ;
        }

        // target - candidates[i] 如果小于0, 就没有必要进行后面的循环了
        for(int i = index; i < candidates.length && target - candidates[i] >= 0; i++){
            // 一个元素只使用一次。
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            list.add(candidates[i]);
            // 元素不可以重用,所以是 i+1
            backtrack(candidates, target-candidates[i], i + 1, list);
            list.remove(list.size() -  1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        List<List<Integer>> result = new CombinationSum2().combinationSum2(candidates, 8);
        System.out.println(result.toString());
    }

}
