package algorithms.problems.dynamic_programming.x0001_best_time_to_buysand_sell_stock;

// The worst case
public class Solution1 {

    private int maxValue;
    private int maxPos;

    public int maxProfit(int prices[]) {
        if (prices.length < 2)
        {
            return 0;
        }
        
        max(prices, 1);
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i ++)
        {
            if (i > maxPos)
            {
                max(prices, i);
            }

            if (i <= maxPos)
            {
                if ((maxValue - prices[i]) > maxprofit)
                {
                    maxprofit = maxValue - prices[i];
                }
            }
        }

        return maxprofit;
    }

    void max(int prices[], int index)
    {
        maxValue = prices[index];
        for (int i = index+1; i < prices.length; i++)
        {
            if (maxValue < prices[i])
            {
                maxValue = prices[i];
                maxPos = i;
            }
        }
    }
}