package j.y2023.q2352;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int equalPairs(int[][] grid) {
        int cols = grid[0].length;
        Map<String, Integer> map = new HashMap<>();
        for (int[] ints : grid) {
            StringBuilder sb = new StringBuilder();
            for (int num : ints) {
                sb.append(num);
                sb.append(",");
            }
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;
        for (int col = 0; col < cols; col++) {
            StringBuilder sb = new StringBuilder();
            for (int[] ints : grid) {
                sb.append(ints[col]);
                sb.append(",");
            }

            String key = sb.toString();
            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }

        return count;
    }
}
