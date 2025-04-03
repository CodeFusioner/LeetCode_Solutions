class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char i: s.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(char i: t.toCharArray()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        boolean flag = false;
        for(char i : s.toCharArray()){
            if(map1.containsKey(i) && map2.containsKey(i) && map1.get(i) > 0 && map2.get(i) > 0){
                map1.put(i,map1.get(i)-1);
                map2.put(i,map2.get(i)-1);
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}