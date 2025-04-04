class Solution {
    public int maxDepth(String s) {
        int currD = 0;
        int maxD = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                currD++;
                maxD = Math.max(currD , maxD);
            }else if(ch == ')'){
                currD--;
            }
        }
        return maxD;
    }
}