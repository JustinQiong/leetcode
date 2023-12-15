package j.y2023.dec.q482;

/**
 * 482. License Key Formatting
 * Iterate the chars from the end to the beginning of the
 * String s. Then reverse the response char array and return it
 * as a String
 */
public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        int n = s.length();
        char[] chs = s.toCharArray();
        int resSize = 0;
        int x = 0;
        char[] res = new char[2 * n];
        for (int i = n - 1; i >= 0; i--) {
            char ch = chs[i];
            if (ch != '-') {
                if (ch > 'Z') {
                    ch -= 32; // Upper case the low case letter
                }
                resSize++;
                x++;
                res[2 * n - resSize] = ch;
                if (x % k == 0) {
                    resSize++;
                    res[2 * n - resSize] = '-';
                }
            }
        }
        char[] reversed = new char[resSize];
        int i = 0;
        int count = 0;
        // reverse the res array
        while (i < resSize) {
            char c = res[2 * n - resSize + i];
            if (i != 0 || c != '-') { // skip the last '-'
                reversed[count++] = c;
            }
            i++;
        }
        return new String(reversed, 0, count);
    }

}
