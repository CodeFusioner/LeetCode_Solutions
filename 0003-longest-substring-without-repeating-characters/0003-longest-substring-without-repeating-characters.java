class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high = 0;
        Set<Character> set = new HashSet();
        int maxLen = 0;
        while(high < s.length()){
            char ch = s.charAt(high);
            if(!set.contains(ch)){
                set.add(ch);
                maxLen = Math.max(maxLen, high-low+1);
                high++;
            }else{
                set.remove(s.charAt(low));
                low++;
            }
        }
        return maxLen;
    }
}