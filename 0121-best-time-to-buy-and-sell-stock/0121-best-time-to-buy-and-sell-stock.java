class Solution {
    public int maxProfit(int[] prices) {
        int low = 0, profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[low] > profit) {
                profit = prices[i] - prices[low];
            }
            if (prices[i] < prices[low]) {
                low = i;
            }
        }
        return profit;
    }
}