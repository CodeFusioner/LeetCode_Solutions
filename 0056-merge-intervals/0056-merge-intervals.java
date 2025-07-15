class Solution {
    public int[][] merge(int[][] intervals) {
        return mergeIntervals(intervals);
    }
    public int [][] mergeIntervals(int [][] arr){
        if(arr.length == 0){
            return new int[0][0];
        }
        Arrays.sort(arr , (a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        res.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            int [] lastArr = res.getLast();
            if(lastArr[1] >= arr[i][0]){
                lastArr[1] = Math.max(lastArr[1] , arr[i][1]);
            }else{
                res.add(arr[i]);
            }
        }

        return res.toArray(new int[res.size()][]);

    }
}