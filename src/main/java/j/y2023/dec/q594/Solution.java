package j.y2023.dec.q594;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. Longest Harmonious Subsequence
 * Accumulate the occurrence of each number in nums array.
 * Calculate the max len of
 * (occurrence of current number + occurrence of current number + 1);
 */
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);;
        }

        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num+1)) {
                max = Math.max(max, map.get(num)+map.get(num+1));
            }

        }

        return max;
    }
}
