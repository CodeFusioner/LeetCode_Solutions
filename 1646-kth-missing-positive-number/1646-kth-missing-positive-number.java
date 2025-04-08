class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0, current = 1;
        while (k > 0) {
            if (i < arr.length && arr[i] == current) {
                i++; // number exists in array
            } else {
                k--; // it's a missing number
                if (k == 0)
                    return current;
            }
            current++;
        }
        return -1; // should never reach
    }
}