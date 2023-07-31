package j.q205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
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
}
