class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int num: weights){
            low = Math.max(low,num);
            high += num;
        }
        int ans = high;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(helper(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean helper(int [] weights, int mid , int days){
        int use = 1;
        int load = 0;
        for(int num: weights){
            if(load+num > mid){
                load = 0;
                use++;
            }
            load+=num;
        }
        return use <= days;
    }
}