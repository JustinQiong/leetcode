package j.y2023.dec.q541;

public class Solution {

    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] chs = s.toCharArray();
        for (int i = 0; i < n; i += 2 * k) {
            reverse(chs, i, Math.min(n, i + k) - 1);
        }
        return new String(chs);
    }

    private void reverse(char[] chs, int left, int right) {
        while (left < right) {
            char tmp = chs[right];
            chs[right--] = chs[left];
            chs[left++] = tmp;
        }
    }
}
