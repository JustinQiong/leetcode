package j.q80;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int curr = 1;
        Set<Integer> duplicate = new HashSet<>();
        while (curr < nums.length) {
            if (nums[curr] != nums[i]) {
                nums[++i] = nums[curr];
            } else if (!duplicate.contains(nums[curr])) {
                nums[++i] = nums[curr];
                duplicate.add(nums[curr]);
            }
            curr++;
        }

        return i + 1;
    }
}
