class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxPrices = 0;
        for(int price : prices){
            if(price < minPrices){
                minPrices = price;
            }else{
                maxPrices = Math.max(maxPrices, price - minPrices);
            }
        }
        return maxPrices;
    }
}
