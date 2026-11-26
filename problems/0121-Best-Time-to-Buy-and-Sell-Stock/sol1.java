// ==========================================================
// 121. Best Time to Buy and Sell Stock
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 93.6 MB (Beats 93%)
// Link       : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// ==========================================================

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minprice) {
                minprice = prices[i];
            }

            int profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit, profit);

        }
        return maxprofit;

    }
}