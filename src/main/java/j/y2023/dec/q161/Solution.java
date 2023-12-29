package j.y2023.dec.q161;

/**
 * 162. Find Peak Element
 * Binary search solution
 * Left pointer point to 0 and right pointer point to nums.length-1;
 * Check the number at mid=(right+left/2) if it is peek, if it is peek,
 * return mid.
 * If it is less than the number on its right, then search the right partition.
 * If it is less than the number on its left, then search the left partition.
 */
public class Solution {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (isPeek(nums, mid)) {
                return mid;
            } else if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    private static boolean isPeek(int[] nums, int i) {
        int n = nums.length;
        return (i == 0 || nums[i] > nums[i - 1]) && (i == n - 1 || nums[i] > nums[i + 1]);
    }

}
