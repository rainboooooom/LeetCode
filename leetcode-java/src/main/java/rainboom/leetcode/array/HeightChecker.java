package rainboom.leetcode.array;

/**
 * 1051. 高度检查器
 * 
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * 请你返回至少有多少个学生没有站在正确位置数量。
 * 该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * @author RainbomSea
 *
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
    	int ans = 0;
    	
    	int[] temp = new int[101];
    	for(int height:heights) {
    		temp[height]++;
    	}
    	
    	for(int i = 1, j=0; i < temp.length; i++) {
    		while(temp[i]-- > 0) {
    			if(heights[j++] != i)
    				ans++;
    		}
    	}
    	
		return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(new HeightChecker().heightChecker(new int[]{1,1,4,2,1,3}));
	}
}
