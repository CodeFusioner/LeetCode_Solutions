class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                max = Math.max(cnt,max);
                cnt = 0;
            }
        }
        max = Math.max(cnt,max);
        return max;
    }
}