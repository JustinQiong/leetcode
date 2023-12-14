package j.y2023.q242;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            table[ss - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char tt = t.charAt(i);
            int idx = tt - 'a';
            table[idx]--;
            if (table[idx] < 0) {
                return false;
            }
        }

        return true;
    }

}
