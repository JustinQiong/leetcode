package j.y2023.q27;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int curr = 0;
        while (curr < nums.length) {
            if (nums[curr] != val) {
                nums[i++] = nums[curr];
            }
            curr++;
        }
        return i;
    }
}
