package j.y2023.q387;

public class Solution {
    public int firstUniqChar(String s) {
        char[] chs = s.toCharArray();
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[chs[i] - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (table[chs[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
