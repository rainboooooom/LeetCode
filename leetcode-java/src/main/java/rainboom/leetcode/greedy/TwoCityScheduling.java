package rainboom.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1029. 两地调度
 * 
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 * 
 * @author RainbomSea
 *
 */
public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o1[1] - (o2[0] - o2[1]);
			}
		});
        int n = costs.length / 2;
        for (int i = 0; i < n; i++) {
			ans += costs[i][0] + costs[i+n][1];
		}
        return ans;
    }
    
    public static void main(String[] args) {
    	int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
		System.out.println(new TwoCityScheduling().twoCitySchedCost(costs));
	}
}
