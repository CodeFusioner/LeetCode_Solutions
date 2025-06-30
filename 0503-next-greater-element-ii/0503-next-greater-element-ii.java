class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i=0;i<n*2;i++){
            while(!st.isEmpty() && nums[i%n] > nums[st.peek()]){
                arr[st.pop()] = nums[i%n];
            }
            st.push(i%n);
        }
        return arr;
    }
}