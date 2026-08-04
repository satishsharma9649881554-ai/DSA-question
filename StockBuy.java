public class StockBuy {

    public static int stocksellBuy(int prices[]){
        int n = prices.length;
        int maxprofit = 0;
        int bestBuy = prices[0];

        for(int i=1; i<n; i++){
            if(prices[i] > bestBuy) {
                maxprofit = Math.max(maxprofit, (prices[i]-bestBuy));
            }

            bestBuy = Math.min(bestBuy,prices[i]);
        }
        return maxprofit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = stocksellBuy(prices);
        System.out.println(ans);

    }
}
