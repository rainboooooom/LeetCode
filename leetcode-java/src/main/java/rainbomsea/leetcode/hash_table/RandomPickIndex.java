package rainbomsea.leetcode.hash_table;

import java.util.*;

/**
 * 398.随机数索引
 * @Description: RandomPickIndex
 * @Author rainbomsea
 * @Date: 2022/4/25 10:10
 * @Version 1.0
 */
public class RandomPickIndex {

    Map<Integer, List<Integer>> map = new HashMap<>();

    Random random = new Random();

    public RandomPickIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get(random.nextInt(list.size()));
    }
}
