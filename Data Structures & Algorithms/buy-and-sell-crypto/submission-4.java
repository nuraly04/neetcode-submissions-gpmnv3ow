class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int right =0;

        while (right < prices.length) {
            max = Math.max(max, prices[right] - min);

            if (min > prices[right]) {
                min = prices[right];
            }
            right++;
        }

        return max;
    }
}
