class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1] , a[1]));
        int unit = 0;
        for(int [] arr: boxTypes){
            if(truckSize - arr[0] >= 0){
                unit += arr[0] * arr[1];
                truckSize -= arr[0];
            }else{
                unit += truckSize * arr[1];
                truckSize = 0;
            }
        }
        return unit;
    }
}