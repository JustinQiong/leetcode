package j.y2023.dec.q495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                res += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
            } else {
                res += duration;
            }
        }

        return res;
    }
}
