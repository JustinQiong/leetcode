package j.q455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int totalChildren = g.length;
        int totalCookies = s.length;

        int child = 0;
        int cookie = 0;
        while (child < totalChildren && cookie < totalCookies) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }

        return child;
    }
}
