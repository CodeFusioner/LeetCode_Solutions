class Solution {
    public int maxProfit(int[] prices) {
        int maxp = Integer.MIN_VALUE;
        int minp = Integer.MAX_VALUE;
        for(int num : prices){
            if(num < minp){
                minp = num;
            }
            maxp = Math.max(maxp, num - minp);
        }
        return maxp;
    }
}