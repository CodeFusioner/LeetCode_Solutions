class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;

        // Take the first k cards from the front
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }

        int max = total;

        // Now try replacing cards from the front with cards from the end
        for (int i = 0; i < k; i++) {
            total -= cardPoints[k - 1 - i]; // remove one from the front
            total += cardPoints[n - 1 - i]; // add one from the end
            max = Math.max(max, total);
        }

        return max;
    }
}