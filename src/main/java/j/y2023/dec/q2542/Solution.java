package j.y2023.dec.q2542;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 2542. Maximum Subsequence Score
 * Pair num1 and num2 array into a paired array arr.
 * Sort arr by value of nums2.
 * Add each element of nums1 into a priority queue.
 * Calculate the max score of the sequence and return.
 */
public class Solution {

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums1[i];
            arr[i][1] = nums2[i];
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        long sum = 0;
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i][0]);
            sum += arr[i][0];
        }
        long max = sum * arr[k - 1][1];
        for (int i = k; i < n; i++) {
            if (arr[i][0] > minHeap.peek()) {
                sum = sum - minHeap.poll() + arr[i][0];
                minHeap.offer(arr[i][0]);
                max = Math.max(max, sum * arr[i][1]);
            }
        }

        return max;
    }
}
