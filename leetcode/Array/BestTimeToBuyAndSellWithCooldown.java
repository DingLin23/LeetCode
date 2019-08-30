public class BestTimewsaatoBuyandSellStockwithCooldown {

     //time : O(n)
     //space : O(1)

  
    public int maxProfit(int[] prices) {
        int sell = 0, prevSell = 0;
        int buy = Integer.MIN_VALUE, prevBuy = 0;
        for (int price : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - price, prevBuy);
            prevSell = sell;
            sell = Math.max(prevBuy + price, prevSell);
        }
        return sell;
    }

    //time: O(n);
    //space: O(n);

    public int maxProfit2(int[] prices){
        if(prices == null || prices.length<=2)return 0;
        int n = prices.length;
        int [] hold = new int [n];
        int [] unhold = new int [n];

        hold[0] = -prices[0];
        for(int i = 1; i< n; i++){
            if(i ==1){
                hold[i] = Math.max(hold[i-1],-price[1]);
            }
            else{
                hold[i] = Math.max(hold[i-1],unhold[i-2]-prices[i]);
            }
            unhold[i] = Math.max(unhold[i-1], hold[i-1]+prices[i]);
        }
        return unhold[n-1];


    }
}
