class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        StringBuilder n = new StringBuilder();
        n.append(num);
        num = Integer.parseInt(n.reverse().toString());
        while(num > 0){
            int rem = num %10;
            if(rem == 6 && flag == true){
                sb.append(9);
                flag = false;
            }else{
                sb.append(rem);
            }
            num = num/10;
        }
        int ans = Integer.parseInt(sb.toString());
        return ans;
    }
}