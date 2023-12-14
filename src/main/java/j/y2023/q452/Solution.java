package j.y2023.q452;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int right = points[0][1];
        int ans = 1;
        for (int[] point : points) {
            if (point[0] > right) {
                right = point[1];
                ans++;
            }
        }
        return ans;
    }
}
