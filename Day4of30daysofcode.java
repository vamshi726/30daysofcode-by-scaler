//Problem:  Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            int cost=prices[i]-min;
            maxProfit=Math.max(maxProfit,cost);
            min=Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

*/
