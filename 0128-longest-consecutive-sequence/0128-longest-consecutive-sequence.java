class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int currNum = num;
                int currLen = 1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }
                max = Math.max(max,currLen);
            }
        }
        return max;
    }
}