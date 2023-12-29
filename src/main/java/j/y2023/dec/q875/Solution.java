package j.y2023.dec.q875;

/**
 * 875. Koko Eating Bananas
 * Binary search from 1 to max element of piles array.
 * Find the minimum k less than h hours.
 */
public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE, min = 1;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int left = min, right = max;
        int res = max;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            long hour = countHour(piles, mid);
            if (hour <= h) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private long countHour(int[] piles, int perHour) {
        long count = 0;
        for (int pile : piles) {
            count += (pile- 1) / perHour + 1;
        }
        return count;
    }
}
