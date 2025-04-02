class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int j=n-1;
        while(j>=0 && (num.charAt(j)-0) % 2 == 0){
            j--;
        }
        return num.substring(0,j+1);
    }
}