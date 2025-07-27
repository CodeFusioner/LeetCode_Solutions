class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        int low = 0, high = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high < n){
            map.put(arr[high], map.getOrDefault(arr[high],0)+1);
            while(map.size() > 2){
                map.put(arr[low] , map.get(arr[low])-1);
                if(map.get(arr[low]) == 0){
                    map.remove(arr[low]);
                }
                low++;
            }
            if(map.size() <= 2){
                maxLen = Math.max(maxLen,(high-low)+1);
            }
           
            high++;
        }
        return maxLen;
    }
}