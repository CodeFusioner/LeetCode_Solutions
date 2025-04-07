class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else { // nums[mid] == nums[high]
                high--; // Can't decide, reduce the search space
            }
        }

        return nums[low];

    }
}