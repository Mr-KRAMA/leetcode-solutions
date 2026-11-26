// ==========================================================
// 122. Best Time to Buy and Sell Stock II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46 MB (Beats 69%)
// Link       : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// ==========================================================

class Solution {
    public int maxProfit(int[] prices) {
        
         int Profit =0;
         for( int i=1;i<prices.length;i++){
            if(prices[i]> prices[i-1]){
                Profit+=prices[i]-prices[i-1];
            }
         }
         return Profit ;
    }
    
}