package j.other;

public class Solution {

    public String eliminateABCD(String s) {
        int l = 0, r = 0;
        int n = s.length();
        char[] chs = s.toCharArray();
        while (r < n) {
            swap(chs, l, r);
            if (l > 0 && ((chs[l] == 'a' && chs[l - 1] == 'b') ||
                    (chs[l] == 'b' && chs[l - 1] == 'a') ||
                    (chs[l] == 'c' && chs[l - 1] == 'd') ||
                    (chs[l] == 'd' && chs[l - 1] == 'c'))) {
                l--;
            } else {
                l++;
            }
            r++;
        }

        return String.valueOf(chs, 0, l);
    }

    private void swap(char[] chs, int a, int b) {
        char temp = chs[a];
        chs[a] = chs[b];
        chs[b] = temp;
    }
}
