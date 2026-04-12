class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if(n == 1){
            return true;
        }
        while(n > 9){
            sum = getSum(n);
            n = sum;
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    public int getSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += (digit*digit);
            n = n / 10;
        }
        return sum;
    }
}