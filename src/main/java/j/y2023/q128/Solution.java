package j.y2023.q128;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curr = 1;
                while (set.contains(num + 1)) {
                    num++;
                    curr++;
                }
                max = Math.max(max, curr);
            }
        }

        return max;
    }
}
