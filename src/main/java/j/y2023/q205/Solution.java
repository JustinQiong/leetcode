package j.y2023.q205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphicHash(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if ((s2t.containsKey(sCh) && s2t.get(sCh) != tCh)
                    || (t2s.containsKey(tCh) && t2s.get(tCh) != sCh)) {
                return false;
            }
            s2t.put(sCh, tCh);
            t2s.put(tCh, sCh);
        }

        return true;
    }

    public boolean isIsomorphicArray(String s, String t) {
        int[] s2t = new int[128];
        int[] t2s = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (s2t[ss] != t2s[tt]) {
                return false;
            }
            s2t[ss] = i+1;
            t2s[tt] = i+1;
        }
        return true;
    }
}
