class Solution {
 
    public int trap(int[] height) {
        int sum = 0;
        for( int i = 0; i <height.length; i++){
            int max1 = 0;
            int max2 = 0;
             // left maximum
            for(int j = 0;j<=i;j++){
                 max1 = Math.max(max1 , height[j]);
            }
            // right maximum
            for(int j =i;j<height.length;j++){
                max2 = Math.max(max2 , height[j]);
            }
            sum += Math.min(max1 , max2) - height[i];
        }
        return sum;
    }
}