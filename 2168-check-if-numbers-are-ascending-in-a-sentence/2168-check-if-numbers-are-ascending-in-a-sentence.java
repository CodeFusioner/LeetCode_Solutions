class Solution {
    public boolean areNumbersAscending(String s) {
        String [] arr = s.split(" ");
        int prev = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if(Character.isDigit(str.charAt(0))){
                int n = Integer.parseInt(str);
                System.out.println(n);
                if(n <= prev){
                    return false;
                }else{
                    prev = n;
                }
            }
        }
        return true;
    }
}