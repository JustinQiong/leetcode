package j.y2023.q1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            Integer count = map.get(n);
            if (count == null) {
                count = 0;
            }
            map.put(n, ++count);
        }

        Set<Integer> times = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            times.add(entry.getValue());
        }

        return map.size() == times.size();
    }
}
