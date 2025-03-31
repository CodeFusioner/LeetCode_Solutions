class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val: nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int frq = map.get(nums[i]);
            int mjr = n/2;
            if(frq>mjr){
                return nums[i];
            }
        }
        return 0;
    }
}