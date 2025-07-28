class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cnt = 0;
        int oddcnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 != 0){
                oddcnt++;
            }
            if(map.containsKey(oddcnt-k)){
                cnt += map.get(oddcnt-k);
            }
            map.put(oddcnt, map.getOrDefault(oddcnt,0)+1);
        }
        return cnt;
    }
}