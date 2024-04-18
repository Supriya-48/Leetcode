package top_interview_150;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
