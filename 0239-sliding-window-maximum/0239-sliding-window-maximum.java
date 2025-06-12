class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] prefix = new int[n];
        for(int i =0;i<nums.length;i++){
            if(i%k == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = Math.max(nums[i] , prefix[i-1]);
            }
        }
        int [] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            if((i+1)%k == 0){
                suffix[i] = nums[i];
            }else{
                suffix[i] = Math.max(nums[i] , suffix[i+1]);
            }
        }
        int [] ans = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            ans[i] = Math.max(suffix[i] , prefix[i+k-1]);
        }
        return ans;
    }
}