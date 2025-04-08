class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] arr, int mid, int days) {
        int load = 0;
        int usedDays = 1;
        for(int num : arr){
            if(load+num > mid){
                load = 0;
                usedDays++;
            }
            load += num;
        }
        return usedDays <= days;
    }
}