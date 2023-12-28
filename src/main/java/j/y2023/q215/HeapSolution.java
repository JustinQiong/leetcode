package j.y2023.q215;

import java.util.PriorityQueue;

/**
 * 215. Kth largest element in an array
 * Store each number into the minHeap which is
 * a PriorityQueue in Java. When heap.peek < current number,
 * pop the top element of the queue and push the current number
 * into the PriorityQueue. Finally, we will get the kth largest
 * element by queue.peek.
 */
public class HeapSolution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}
