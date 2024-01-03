package j.y2024.jan.q2462;

import java.util.PriorityQueue;

/**
 * 2462. Total Cost to Hire K Workers
 *
 * <a href="https://leetcode.cn/problems/total-cost-to-hire-k-workers/solutions/2587602/gu-yong-kwei-gong-ren-de-dai-jie-javayi-67my8/">my solution on leetcode.cn</a>
 */
public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long total = 0L;
        PriorityQueue<Integer> minHeapLeft = new PriorityQueue<>(candidates); // 左最小堆
        PriorityQueue<Integer> minHeapRight = new PriorityQueue<>(candidates); // 右最小堆
        int left = 0, right = costs.length - 1;
        for (int i=0; i<k; i++) {
            while (left <= right && minHeapLeft.size() < candidates) { // 从左侧加入左堆
                minHeapLeft.offer(costs[left++]);
            }

            while (left <= right && minHeapRight.size() < candidates) { // 从右侧加入右堆
                minHeapRight.offer(costs[right--]);
            }

            if (minHeapLeft.isEmpty()) { // 左堆为空, 弹出右堆
                total += minHeapRight.poll();
            } else if (minHeapRight.isEmpty()) { // 右堆为空, 弹出左堆
                total += minHeapLeft.poll();
            } else { // 都不为空则选堆顶较小的弹出
                int minLeft = minHeapLeft.peek();
                int minRight = minHeapRight.peek();
                if (minLeft <= minRight) {
                    total += minHeapLeft.poll();
                } else {
                    total += minHeapRight.poll();
                }
            }
        }

        return total;
    }
}
