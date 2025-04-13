package Arrays;

public class Leetcode121_BuyAndSellStockI {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4, 10 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int minPrice = prices[0];
		int maxProfit = 0;
		int cost = 0;
		for (int i = 1; i < prices.length; i++) {
			cost = prices[i] - minPrice;
			maxProfit = Math.max(maxProfit, cost);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}

}
