package rainbomsea.leetcode.two_pointers;

/**
 * 11. 盛最多水的容器
 * 
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @author RainbomSea
 *
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int left = 0, right = height.length-1;
    	int ans = 0;
    	
    	while (left < right) {
    		ans = Math.max(ans, (right - left)*Math.min(height[left], height[right]));
			
    		if (height[left] < height[right]) 
				left++;
			else 
				right--;
		}
    	return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(new ContainerWithMostWater().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
}
