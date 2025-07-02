class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int prev = intervals[0][0];
        for(int [] interval : intervals){
            if(interval[0] >= prev){
                count++;
                prev = interval[1];
            }
        }
        System.out.println(count);
        return intervals.length - count;
    }
}