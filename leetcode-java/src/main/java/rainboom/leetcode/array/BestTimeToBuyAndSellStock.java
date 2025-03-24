package rainboom.leetcode.array;


/**
 * 121. 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int ans = 0;
		int minPrices = prices[0];
		for(int i = 1; i < prices.length; i++) {
			if(minPrices > prices[i]) {
				minPrices = prices[i];
			} else {
				ans = Math.max(ans, prices[i] - minPrices);
			}
		}
		return ans;
	}

    public static void main(String[] args) {
    	int[] prices = {7,1,5,3,6,4};
		System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
	}
    
}
