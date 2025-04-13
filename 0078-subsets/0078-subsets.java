class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add the current subset

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Choose the current element
            helper(nums, i + 1, current, result); // Explore further
            current.remove(current.size() - 1); // Backtrack (remove last)
        }
    }
}
