class Solution {
    public boolean isPalindrome(int s) {
        String x = s + "";
        int i = 0;
        int j = x.length()-1;
        while(i<=j){
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}