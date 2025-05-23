class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0, j = nums.length-1;
        int idx = 0;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                i = mid +1;
                idx  = i;
            }else{
                j = mid - 1;
            }
        }
        return idx;
    }
}