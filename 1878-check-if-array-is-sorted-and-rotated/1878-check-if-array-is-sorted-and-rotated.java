class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i%n] <= nums[(i+1)%n]){

            }else{
                count++;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}