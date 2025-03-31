class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        Arrays.sort(nums);
        int len=0;
        int maxLen=Integer.MIN_VALUE;
        int seq = nums[0];
        int j = 0;
        int [] arr = Arrays.stream(nums).distinct().toArray();
        while(j<arr.length){
            if(seq == arr[j]){
                len++;
                maxLen = Math.max(maxLen , len);
                seq++;
            }else{
                len=0;
                seq = arr[j];
                j--;
            }
            j++;
        }
        return maxLen;
    }
}