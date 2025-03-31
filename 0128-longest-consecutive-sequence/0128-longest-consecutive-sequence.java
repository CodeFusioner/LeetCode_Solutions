class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int i: set){
            System.out.print(i+" ");
        }
        int maxLen = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currNum = num;
                int currLen = 1;
                while(set.contains(currNum + 1)){
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen , currLen);
            }
        }
        return maxLen;
    }
}