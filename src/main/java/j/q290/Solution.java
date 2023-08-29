package j.q290;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] splits = s.split(" ");
        if (splits.length != pattern.length()) {
            return false;
        }

        Map<String, Character> str2Ch = new HashMap<>();
        Map<Character, String> ch2Str = new HashMap<>();
        int i = 0;
        for (; i < splits.length; i++) {
            char ch = pattern.charAt(i);
            String split = splits[i];
            if (str2Ch.containsKey(split) && ch != str2Ch.get(split)) {
                return false;
            }

            if (ch2Str.containsKey(ch) && !split.equals(ch2Str.get(ch))) {
                return false;
            }

            str2Ch.put(split, ch);
            ch2Str.put(ch, split);
        }

        return i == splits.length;
    }

}
