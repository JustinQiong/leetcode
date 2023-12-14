package j.y2023.q434;

public class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int res = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if ((i == 0 || chs[i - 1] == ' ') && chs[i] != ' ') {
                res++;
            }
        }

        return res;
    }
}
