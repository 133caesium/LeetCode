package LeetCode.Problem121;

public class Solution {

//    This is an optimal solution, from user abhishekagrawal28
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }


//    This was the first solution to be accepted at LeetCode but it is messy
    public int maxProfit_first_passing_solution(int[] prices) {

        int currentProfit;
        int maxProfit = 0;
        for (int purchaseDay = 0, sellDay = 1; purchaseDay < prices.length && sellDay < prices.length; purchaseDay++) {
            currentProfit = prices[sellDay]-prices[purchaseDay];
            while (currentProfit>0) {
                if (currentProfit>maxProfit) {
                    maxProfit = currentProfit;
                }
                sellDay++;
                if (sellDay==prices.length) {break;}
                currentProfit = prices[sellDay]-prices[purchaseDay];
            }
            purchaseDay = sellDay-1;
            sellDay++;
        }
        return maxProfit;
    }
// This solution is too slow, time limit exceeded
    public int maxProfit_first_solution(int[] prices) {

        int currentProfit;
        int maxProfit = 0;
        int[] bestProfitIfBuy = new int[prices.length];

        for (int purchaseDay = 0; purchaseDay < prices.length; purchaseDay++) {
            for (int sell_day = purchaseDay; sell_day < prices.length; sell_day++) {
                currentProfit = prices[sell_day]-prices[purchaseDay];
                if (prices[sell_day]-prices[purchaseDay]>bestProfitIfBuy[purchaseDay]) {
                    bestProfitIfBuy[purchaseDay] = currentProfit;
                }
            }
            if (bestProfitIfBuy[purchaseDay]>maxProfit) {
                maxProfit = bestProfitIfBuy[purchaseDay];
            }

        }
        return maxProfit;
    }
}
