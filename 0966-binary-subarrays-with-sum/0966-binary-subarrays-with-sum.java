class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == goal){
                    cnt++;
                }
                if(sum > goal){
                    break;
                }
            }
        }
        return cnt;
    }
}