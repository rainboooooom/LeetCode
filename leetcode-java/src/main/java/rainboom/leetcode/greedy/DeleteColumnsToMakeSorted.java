package rainboom.leetcode.greedy;

/**
 * 944. 删列造序
 * 
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 * 你需要选出一组要删掉的列 D，对 A 执行删除操作，
 * 使 A 中剩余的每一列都是 非降序 排列的，然后请你返回 D.length 的最小可能值。
 * @author RainbomSea
 *
 */
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
    	int ans = 0;
    	for(int i = 0; i < A[0].length(); i++) {
    		for(int j = 1; j < A.length; j++) {
    			if(A[j-1].charAt(i) > A[j].charAt(i)) {
    				ans++;
    				break;
    			}
    		}
    	}
		return ans;
    }
}
