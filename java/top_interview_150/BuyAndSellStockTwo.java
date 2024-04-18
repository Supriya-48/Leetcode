package top_interview_150;

public class BuyAndSellStockTwo {
    public int maxProfit(int[] prices) {
        int sumProfit=0,minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] - minPrice > 0){
                sumProfit+= prices[i] - minPrice;
                minPrice=prices[i];
            }
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
        }
        return sumProfit;
    }
}
