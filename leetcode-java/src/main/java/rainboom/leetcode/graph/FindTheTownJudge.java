package rainboom.leetcode.graph;

/**
 * 997. 找到小镇的法官
 * 
 * 在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
 * 如果小镇的法官真的存在，那么：
 * 小镇的法官不相信任何人。
 * 每个人（除了小镇法官外）都信任小镇的法官。
 * 只有一个人同时满足属性 1 和属性 2 。
 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
 * @author RainbomSea
 *
 */
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
    	int ans = -1;
    	int [][] temp = new int[N+1][2];
    	
    	for(int[] array : trust) {
    		temp[array[0]][0] ++; // 记录出度
    		temp[array[1]][1] ++; // 记录入度
    	}
    	
    	for (int i = 1; i < temp.length; i++) {
    		// 入度为N-1 , 出度为0就是法官
			if(temp[i][0] == 0 && temp[i][1] == N-1) {
				ans = i;
				break;
			}
		}
    	
		return ans;
    }
}
