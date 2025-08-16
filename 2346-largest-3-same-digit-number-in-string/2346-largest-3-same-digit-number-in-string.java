class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for(int i=0;i<num.length()-2;i++){
            String sub = num.substring(i,i+3);
            boolean flag = true;
            for(int j=0;j<sub.length();j++){
                if(sub.charAt(0) != sub.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                max = Math.max(max,Integer.parseInt(sub));
            }
        }
        if(max == -1){
            return "";
        }else if(max == 0){
            return "000";
        }
        String ans = max+"";
        return ans;
    }
}