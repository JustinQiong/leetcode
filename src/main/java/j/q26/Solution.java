package j.q26;

import java.util.logging.Level;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int curr = 1;
        while (curr < nums.length) {
            if (nums[curr] != nums[i]) {
                nums[++i] = nums[curr];
            }
            curr++;
        }
        return i + 1;
    }
}
