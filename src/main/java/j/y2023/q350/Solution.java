package j.y2023.q350;

import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] set = new int[1001];
        for (int n : nums1) {
            set[n]++;
        }

        int[] res = new int[1001];
        int i = 0;
        for (int n : nums2) {
            if (set[n] > 0) {
                res[i++] = n;
                set[n]--;
            }
        }

        return Arrays.copyOf(res, i);
    }
}
