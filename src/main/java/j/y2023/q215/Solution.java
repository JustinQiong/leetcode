package j.y2023.q215;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        return select(list, k);
    }

    private int select(List<Integer> nums, int k) {
        List<Integer> large = new ArrayList<>();
        List<Integer> low = new ArrayList<>();

        Random ran = new Random();
        int pivot = nums.get(ran.nextInt(k));
        for (int num : nums) {
            if (num < pivot) {
                low.add(num);
            } else if (num > pivot) {
                large.add(num);
            }
        }

        if (large.size() >= k) {
            return select(large, k);
        }
        if (nums.size() - low.size() < k) {
            return select(low, k -nums.size() + low.size());
        }

        return pivot;
    }
}
