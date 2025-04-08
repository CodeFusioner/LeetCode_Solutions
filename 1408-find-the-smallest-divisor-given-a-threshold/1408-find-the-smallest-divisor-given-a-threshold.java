class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(nums, mid, threshold)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int [] arr, int mid, int threshold){
        int sum = 0;
        for(int num : arr){
           sum += (num + mid - 1) / mid;
        }
        return sum <= threshold;
    }
    public int getMax(int []arr){
        int max = arr[0];
        for(int i:arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}