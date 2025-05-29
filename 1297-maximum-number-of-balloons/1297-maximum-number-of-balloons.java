class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer>req=new HashMap<>();
        for(char c:"balloon".toCharArray()){
            req.put(c,req.getOrDefault(c,0)+1);
        }
        int minCount=Integer.MAX_VALUE;
        for(char c:req.keySet()){
            int a=map.getOrDefault(c,0);
            int n=req.get(c);
            minCount = Math.min(minCount,a/n);
        }
        return minCount;
    }
}