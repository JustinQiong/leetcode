package q88;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i+m] = nums2[i];
        }

        sort(nums1, 0, nums1.length - 1);
    }

    private void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(nums, left, right);
        sort(nums, left, pivot - 1);
        sort(nums, pivot + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int idx = left;
        int pivot = nums[idx];
        while (left < right) {
            while (left < right && nums[right] >= pivot) {
                right--;
            }
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            swap(nums, left, right);
        }
       swap(nums, left, idx);
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
