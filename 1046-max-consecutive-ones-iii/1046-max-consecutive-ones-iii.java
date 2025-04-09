class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt = 0;
        int max = 0;
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            cnt = 0;
            zero = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] == 0){
                    zero++;
                }
                cnt++;
                if(zero > k){
                    break;
                }
                max = Math.max(cnt,max);
            }
           
        }
        return max;
    }
}