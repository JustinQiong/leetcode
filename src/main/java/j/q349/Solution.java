package j.q349;

import java.util.Arrays;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] set = new int[1001];
        for (int n : nums1) {
            set[n]++;
        }

        int[] res = new int[1001];
        int i = 0;
        for (int n : nums2) {
            if (set[n] > 0) {
                res[i++] = n;
            }
            set[n] = 0;
        }

        return Arrays.copyOf(res, i);
    }
}
