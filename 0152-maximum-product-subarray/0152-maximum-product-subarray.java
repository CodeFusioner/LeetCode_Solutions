class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int pd = 1;
            for(int j=i;j<nums.length;j++){
                pd *= nums[j];
                max = Math.max(pd, max);
            }
        }
      
        return max;
    }
}