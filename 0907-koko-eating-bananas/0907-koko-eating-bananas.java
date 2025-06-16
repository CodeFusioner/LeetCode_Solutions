class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMaxPile(piles);
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(piles, mid, h)) {
                high = mid; // move left side
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canEatAll(int[] arr, int k, int h) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (arr[i] + k - 1) / k;
        }
        return total <= h;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
}