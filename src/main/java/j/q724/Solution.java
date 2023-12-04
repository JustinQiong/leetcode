package j.q724;

public class Solution {
    public int pivotIndex(int[] nums) {
            int total = 0;
            for (int num : nums) {
                total += num;
            }

            int pre = 0;
            for (int i = 0; i < nums.length; i++) {
                if (total - pre - nums[i] == pre) {
                    return i;
                }
                pre += nums[i];
            }
            return -1;
    }
}
