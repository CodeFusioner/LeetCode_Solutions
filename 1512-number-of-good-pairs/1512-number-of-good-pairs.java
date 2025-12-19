class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i < j && j< nums.length && i < nums.length && nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}