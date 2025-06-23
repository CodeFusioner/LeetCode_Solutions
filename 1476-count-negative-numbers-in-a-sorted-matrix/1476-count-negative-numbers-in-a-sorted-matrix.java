class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int i=0;i<grid.length;i++){
            int low = 0;
            int high = grid[i].length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(grid[i][mid]<0){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            cnt += grid[i].length - low;
        }
        return cnt;
    }
}