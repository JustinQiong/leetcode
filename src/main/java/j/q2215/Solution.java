package j.q2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n);
        }

        for (int n : nums1) {
            set2.remove(n);
        }

        for (int n : nums2) {
            set1.remove(n);
        }

        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}
