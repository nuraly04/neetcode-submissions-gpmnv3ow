class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int right = i + 1;

            while (right < prices.length) {
                profit = Math.max(profit, prices[right] - prices[i]);
                right++;
            }
        }

        return profit;
    }
}
