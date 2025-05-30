class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : target.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray()){
            int val1 = map1.getOrDefault(ch,0);
            int val2 = map2.get(ch);
            min = Math.min(min,val1/val2);
        }
        return min;
    }
}