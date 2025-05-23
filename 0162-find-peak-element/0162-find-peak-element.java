class Solution {
    public int findPeakElement(int[] nums) {
        int i= 0;
        int j = nums.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid] > nums[mid+1]){
                j = mid; // move left side
            }else {
                i = mid+1; // move right side
            }
        }
        return i;
    }
}