package j.y2023.q647;

public class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += count(s, i, i);
            res += count(s, i, i+1);
        }

        return res;
    }

    private int count(String s, int left, int right) {
        int res = 0;
        int n = s.length();
        while (left >= 0 && right < n) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            res++;
            left--;
            right++;
        }
        return res;
    }


}
