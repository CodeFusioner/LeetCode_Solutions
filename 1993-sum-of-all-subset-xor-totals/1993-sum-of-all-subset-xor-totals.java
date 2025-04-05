class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), res);
        int sum = 0;
        for(List<Integer> arr: res){
            int xor = 0;
            for(int i: arr){
               xor ^= i;
            }
            sum += xor;
            
        }
        return sum;
    }
     private void backtrack(int index, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}