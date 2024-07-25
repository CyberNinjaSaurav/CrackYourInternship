package  Day3;
public class BuyandSellStock_II{

    public int maxProfit(int [] prices){
        int buyPrice = prices[0];
        int profit = 0;
        for(int i= 1; i < prices.length; i++){
            if(prices[i-1] > prices[i]){
                profit += prices[i-1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        profit += prices[prices.length - 1] - buyPrice;
        return profit;
    }


    public static void main(String[] args) {
        

        BuyandSellStock_II stock = new BuyandSellStock_II();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = stock.maxProfit(prices);
        System.out.print( maxProfit);
    }
}