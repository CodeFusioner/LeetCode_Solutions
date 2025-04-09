class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0 , high = 0;
        for(int i: nums){
            low = Math.max(low,i);
            high += i;
        } 
        int ans = high;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean canSplit(int [] arr, int k, int mid){
        int currSum = 0;
        int count = 1;
        for(int num: arr){
            if(currSum+num > mid){
                currSum = num;
                count++;
            }else{
                currSum += num;
            }
        }
        return count <= k;
    }
}