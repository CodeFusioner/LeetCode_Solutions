class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = -1;
        for(int num : arr){
            int value = map.get(num);
            if(value == num){
                max = Math.max(max,num);
            }
        }
        return max;
    }
}