package j.q1657;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Solution {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] cnt1 = new int[26], cnt2 = new int[26];
        int mask1 = 0, mask2 = 0;
        for (byte ch : word1.getBytes(StandardCharsets.ISO_8859_1)) {
            mask1 |= 1 << (ch - 'a');
            cnt1[ch - 'a']++;
        }

        for (byte ch : word2.getBytes(StandardCharsets.ISO_8859_1)) {
            mask2 |= 1 << (ch - 'a');
            cnt2[ch - 'a']++;
        }

        Arrays.sort(cnt1);
        Arrays.sort(cnt2);

        return mask1 == mask2 && Arrays.equals(cnt1, cnt2);
    }

}
