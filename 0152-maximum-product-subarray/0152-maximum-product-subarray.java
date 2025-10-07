class Solution {
    public int maxProduct(int[] nums) {
        int maxpd = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prd = 1;
            for(int j=i;j<nums.length;j++){
                prd *= nums[j];
                maxpd = Math.max(maxpd, prd);
            }
        }
        return maxpd;
    }
}