class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                j = j - 1;
            }else{
                i = i+1;
            }
        }
        return -1;
    }
}