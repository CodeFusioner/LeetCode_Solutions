class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        for(String s : words){
            for(char ch : s.toCharArray()){
                if(!set.contains(ch)){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}