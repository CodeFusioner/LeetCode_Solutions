class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int max1 = 0;
        int max2 = 0;
        for(char ch : "aeiou".toCharArray()){
            int val = map.getOrDefault(ch,0);
            if(val > max1){
                max1 = Math.max(val,max1);
            }
        }
        for(char ch : s.toCharArray()){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                int val = map.getOrDefault(ch,0);
                if(val > max2){
                max2 = Math.max(val,max2);
                }
            }
        }
        return max1 + max2;
    }
}