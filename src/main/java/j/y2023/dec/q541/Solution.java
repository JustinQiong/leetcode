package j.y2023.dec.q541;

public class Solution {

    public String reverseStr(String s, int k) {
        int p = 0;
        int n = s.length();
        char[] chs = s.toCharArray();
        while (p < n) {
            if (p + k > n) {
                reverse(chs, p, n - 1);
            } else {
                reverse(chs, p, p + k-1);
            }
            p += 2*k;
        }
        return new String(chs);
    }

    private void reverse(char[] chs, int left, int right) {
        while (left <= right) {
            char tmp = chs[right];
            chs[right--] = chs[left];
            chs[left++] = tmp;
        }
    }
}
