package j.q45;

public class Solution {

    public int jump(int[] nums) {
        int border = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == border) {
                border = maxPosition;
                steps++;
            }
        }

        return steps;
    }
}
