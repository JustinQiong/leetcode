package j.y2023.q215;

import java.util.Arrays;

public class SortSolution {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
