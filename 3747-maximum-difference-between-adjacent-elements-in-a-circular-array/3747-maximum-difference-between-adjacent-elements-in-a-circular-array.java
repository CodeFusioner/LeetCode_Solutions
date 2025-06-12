class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currDiff = Math.abs(nums[i] - nums[(i+1)%n]);
            max = Math.max(currDiff, max);
        }
        return max;
    }
}