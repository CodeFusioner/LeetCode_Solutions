class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        // dp[0] = 1;
        // dp[1] = 1;
        // for(int i=2;i<=n;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[n];
        return topDown(n,dp);
    }
    public int topDown(int n,int [] dp){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        int left = topDown(n-1,dp);
        int right = topDown(n-2,dp);
        return dp[n] = left+right;
    }
}