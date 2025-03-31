class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int val: nums){
            set.add(val);
        }
        int i=0;
        for(int val: set){
            nums[i] = val;
            i++;
        }
        return i;
    }
}