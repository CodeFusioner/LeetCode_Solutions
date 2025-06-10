class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int maxEven = Integer.MAX_VALUE;
        for(int num: map.values()){
            if(num%2 == 0){
                maxEven = Math.min(num,maxEven);
            }else{
                maxOdd = Math.max(num,maxOdd);
            }
        }
        return maxOdd - maxEven;

    }
    
}