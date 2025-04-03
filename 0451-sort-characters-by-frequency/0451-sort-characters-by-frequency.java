class Solution {
    public String frequencySort(String s) {
        char [] arr = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
           map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        } 

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (e1, e2) -> e2.getValue() - e1.getValue()
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
             for(int i = 0;i<pq.peek().getValue();i++){
                sb.append(pq.peek().getKey());
             }
            pq.poll();
        }
        return sb.toString();

    }
}