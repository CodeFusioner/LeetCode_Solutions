class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int max = 0;
        int left = 0;
        int right = tokens.length-1;
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                score++;
                max = Math.max(max,score);
                left++;
            }else if(score > 0){
                power += tokens[right];
                score--;
                right--;
            }else{
                break;
            }
        }
        
        return max;
    }
}