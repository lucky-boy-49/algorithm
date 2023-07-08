package main.simple;

/**
 * @author HJ
 * 121. 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStocks {

    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE, maxprofit = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args){
        BestTimeToBuyAndSellStocks time = new BestTimeToBuyAndSellStocks();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(time.maxProfit(prices));
    }

}