package LeetCode;

class BestTimeBuySell {
	public int maxProfit(int[] prices)
	{
		int left =0;
		int right =1;
		int maxProfit = 0;   // {7,2,5,3,6,4,8,9,11,0}
		
		System.out.println( "Prices of length" + prices.length);
		while(right < prices.length)
		{
			if(prices[right] > prices[left])
			{
				int profit = prices[right] - prices[left];
				maxProfit = Math.max(maxProfit, profit);
			}
			else
			{
				left = right;
			}
			right++;
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		BestTimeBuySell solution = new BestTimeBuySell();
		
		int[] prices = {7,2,5,3,6,4,8,9,11,0};
		System.out.println("Max Profit: " + solution.maxProfit(prices));
	}
}