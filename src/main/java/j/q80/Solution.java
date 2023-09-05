package j.q80;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int fast = 2;
        int slow = 2;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}
