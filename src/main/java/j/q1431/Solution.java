package j.q1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(extraCandies + candies[i] >= max);
        }

        return res;
    }
}
