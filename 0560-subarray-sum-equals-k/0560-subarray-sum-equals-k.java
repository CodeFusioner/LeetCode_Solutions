class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);
        // int cnt = 0;
        // int sum = 0;
        // for(int num : nums){
        //     sum += num;
        //     if(map.containsKey(sum-k)){
        //         cnt += map.get(sum-k);
        //     }
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // return cnt;
        int cnt = 0;
        for(int i =0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}