class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }else{
                cnt++;
            }
        }
        while(cnt > 0){
            nums[j] = 0;
            j++;
            cnt--;
        }
    }
}