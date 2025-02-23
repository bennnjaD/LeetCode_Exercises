package Easy;

import static java.lang.Math.max;

public class BestTimeToBuyAndSell {
    /*
    Say you have an array for which the *ith* element is the price
    of a given stock on day *i*

    If you were only permitted to complete at most one transaction
    (i.e., buy one and sell one share of the stock),
    design an algorithm to find the maxium profit.

    Note that you cannot sell a stock before you buy one

    Example:
    Input: [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
    profit = 6-1 = 5.
     */

    public int bestTimeToBuy(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        int profit = 0;

        while(right < prices.length) {
            if (prices[left] < prices[right]) {
                profit = prices[r] - prices[1];
                maxProfit = max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

}
