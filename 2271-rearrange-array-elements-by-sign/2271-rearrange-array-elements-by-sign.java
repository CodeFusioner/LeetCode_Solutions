class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length,negindex=1,posindex=0;
        int[] res=new int[n];
        for(int num : nums){
            if(num>0){
                res[posindex]=num;
                posindex+=2;
            }else{
                res[negindex]=num;
                negindex+=2;
            }
        }
        return res;
    }
}