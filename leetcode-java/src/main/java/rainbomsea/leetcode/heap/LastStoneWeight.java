package rainbomsea.leetcode.heap;

/**
 * 1046. 最后一块石头的重量
 * 
 * 有一堆石头，每块石头的重量都是正整数。
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * 		如果 x == y，那么两块石头都会被完全粉碎；
 * 		如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 * 
 * @author RainbomSea
 *
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
    	int n = stones.length;
    	int x=0, y=0;
    	int max;
    	while(n > 1) {
    		max = 0;
    		for(int i = 0; i < stones.length; i++) {
    			if(max < stones[i]) {
    				y = i;
    				max = stones[i];
    			}
    		}
    		max = 0;
    		for(int i = 0; i < stones.length; i++) {
    			if(max < stones[i] && i != y) {
    				x = i;
    				max = stones[i];
    			}
    		}

			stones[y] = stones[y] - stones[x];
			stones[x] = 0;
			n -= 1;
    	}
    	int ans = 0;
    	for(int i = 0; i < stones.length; i++) {
			if(ans < stones[i]) {
				ans = stones[i];
			}
		}
		return ans;
    }
    
    public static void main(String[] args) {
    	int[] stones = new int[] {1, 3};
		System.out.println(new LastStoneWeight().lastStoneWeight(stones));
	}
    
}
