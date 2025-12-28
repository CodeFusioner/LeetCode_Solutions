class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int [] rev = new int[capacity.length];
        int j=0;
        for(int i=capacity.length-1;i>=0;i--){
            rev[j++] = capacity[i];
        }
        int sum = 0;
        for(int num : apple){
            sum += num;
        }
        int cnt = 0;
        for(int num : rev){
            if(sum > 0){
                sum -= num;
                cnt++;
            }
        }
        return cnt;
    }
}