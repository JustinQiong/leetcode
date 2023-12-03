package j.q334;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int first = nums[0], second = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > second) {
                return true;
            } else if (num > first) {
                second = num;
            } else {
                first = num;
            }
        }

        return false;
    }
}
