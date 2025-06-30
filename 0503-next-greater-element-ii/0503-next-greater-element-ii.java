class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n*2;j++){
                if(nums[j%n] > nums[i]){
                    arr[i] = nums[j%n];
                    break;
                }
            }
        }
        return arr;
    }
}