class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int k = groupSize;
        int n = hand.length;
        if(n % k != 0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num: hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(!map.isEmpty()){
            int first = map.firstKey();
            for(int i=0;i<k;i++){
                int curr = first+i;
                if(!map.containsKey(curr)) return false;
                map.put(curr,map.get(curr)-1);
                if(map.get(curr) == 0){
                    map.remove(curr);
                }
            }
        }
        return true;
    }
}