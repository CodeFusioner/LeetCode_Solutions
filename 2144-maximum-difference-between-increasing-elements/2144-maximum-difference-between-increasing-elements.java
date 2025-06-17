class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > min){
                int diff=nums[i]-min;
                max = Math.max(max,diff);
            }else{
                min= Math.min(min,nums[i]);
            }
        }
        return max;
    }
}