class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[0][0];
        }
       LinkedList<int[]> list = new LinkedList<>();
       
    Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
    list.add(intervals[0]);
       for(int i=1;i<intervals.length;i++){
            int [] prev = list.getLast();
            if(prev[1] >= intervals[i][0]){
                prev[1] = Math.max(prev[1],intervals[i][1]);
            }else{
                list.add(intervals[i]);
            }
       }
       return list.toArray(new int[list.size()][]);
    }
}