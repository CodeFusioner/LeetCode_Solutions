class Solution {
    public int longestPalindrome(String s) {
        // in palindrome we use all even char and one odd char
        int count = 0;
        boolean flag = false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int val : map.values()){
            if(val%2==0){
                count += val;
            }else{
                count += val-1;
                flag = true;
            }
        }
        if(flag){
            count += 1;
        }
        return count;
    }
}