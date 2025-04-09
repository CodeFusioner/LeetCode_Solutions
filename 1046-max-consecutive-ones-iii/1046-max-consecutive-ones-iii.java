class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zero = 0, maxLen = 0;
        while (right < nums.length) {
            if (nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}