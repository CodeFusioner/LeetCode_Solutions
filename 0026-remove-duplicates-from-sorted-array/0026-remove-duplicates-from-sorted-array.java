class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}