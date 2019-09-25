package rainbomsea.leetcode.greedy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @author RainbomSea
 *
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
    	int ans = 0;
    	int in = -1;
    	for (int i = 0; i < prices.length; i++) {
			// 买入股票条件: 没买股 不是最后一天 并且后一天的股票大于这一天
    		if(in < 0 && i < prices.length-1 && prices[i] < prices[i+1]) {
				in = prices[i];
				System.out.println("in:"+in);
			}
    		// 抛出股票条件: 买入了股票 并且这一天的股票大于后一天或者这一天是最后一天
    		if(in >= 0 && (i == prices.length-1 || (prices[i] > prices[i+1]))) {
    			System.out.println("out:"+prices[i]);
    			ans += prices[i] - in;
    			in = -1;
    		}
		}
		return ans;
    }
    
    public int maxProfit2(int[] prices) {
    	int ans = 0;
    	int price = prices[0];
    	for(int p: prices) {
    		if(p > price) {
    			ans += p - price;
    		}
    		price = p;
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
    	int[] prices = {7,1,5,3,6,4};
		System.out.println(new BestTimeToBuyAndSellStock2().maxProfit(prices));
	}
    
}
