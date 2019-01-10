package algorithms.problems.dynamic_programming.x0001_best_time_to_buysand_sell_stock;

// The best case
public class Solution2 {
    
    public int maxProfit(int prices[]) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
    
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
    
        return maxProfit;
    }
}