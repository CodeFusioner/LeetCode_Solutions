class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = (low + high) / 2;
            
            // Ensure mid is even for easier pairing check
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; // Move right
            } else {
                high = mid; // Move left
            }
        }
        
        return nums[low];
    }
}