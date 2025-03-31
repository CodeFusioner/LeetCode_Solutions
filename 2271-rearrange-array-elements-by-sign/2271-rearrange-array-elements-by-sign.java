class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> lneg = new ArrayList<>();
        List<Integer> lpos = new ArrayList<>();
        for(int i : nums){
            if(i<0){
                lneg.add(i);
            }else{
                lpos.add(i);
            }
        }
        int n = 0;
        int p = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = lpos.get(p);
                p++;
            }else{
                nums[i] = lneg.get(n);
                n++;
            }
        }
        return nums;
    }
}