class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = prices[0];
        for(int num : prices){
            if(num < minprice){
                minprice = num;
            }
            maxprofit = Math.max(maxprofit, num - minprice);
        }
        return maxprofit;
    }
}