class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int [] candies = new int[n];
        Arrays.fill(candies,1);
        // left side
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        //right side
        for(int i=n-2;i>=0;i--){
            if(arr[i] > arr[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        int tt =0;
        for(int c : candies){
            tt+=c;
        }
        return tt;
    }
}