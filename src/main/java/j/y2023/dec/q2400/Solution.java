package j.y2023.dec.q2400;

import java.util.Arrays;

/**
 * 2300. Successful Pairs of Spells and Potions
 * Sort potions array. And then iterate each element of spells and
 * do binary search on potions array.
 */
public class Solution {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = m - search(potions, spells[i], success);
        }
        return res;
    }

    private int search(int[] potions, int spell, long success) {
        int n = potions.length;
        int left = 0, right = n - 1;
        int res = n;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if ((long) potions[mid] * spell >= success) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}
