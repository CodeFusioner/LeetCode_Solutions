class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int val : prices) {
            if (val < minPrice) {
                minPrice = val;
            }
            maxProfit = Math.max(maxProfit, val - minPrice);
        }
        return maxProfit;
    }
}