class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int low = 0, high = 0, cnt0 = 0;
        while(high<nums.length){
            if(nums[high] == 0) cnt0++;
            while(cnt0 > k){
                if(nums[low] == 0) cnt0--;
                low++;
            }
            if(cnt0 <= k){
                maxLen = Math.max(maxLen, (high-low)+1);
            }
            high++;
        }

        return maxLen;
    }
}