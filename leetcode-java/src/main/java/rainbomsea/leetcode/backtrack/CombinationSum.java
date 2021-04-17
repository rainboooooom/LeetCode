package rainbomsea.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 *
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 *  1.所有数字（包括 target）都是正整数。
 *  2.解集不能包含重复的组合。 
 */
public class CombinationSum {

    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

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
            list.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, list);
            list.remove(list.size() -  1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        List<List<Integer>> result = new CombinationSum().combinationSum(candidates, 7);
        System.out.println(result.toString());
    }

}
