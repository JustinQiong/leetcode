package j.y2024.jan.q17;

import java.util.*;

/**
 * 17. Letter Combinations of a Phone Number
 * Backtrack solution:
 * Try every combination of each char and delete
 * the last char and try another one.
 * Return all the combinations of the char.
 */
public class Solution {
    private List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return Collections.emptyList();
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTrack(map, digits, 0, new StringBuilder());
        return res;
    }

    private void backTrack(Map<Character, String> map, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
        } else {
            char ch = digits.charAt(index);
            String str = map.get(ch);
            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                sb.append(c);
                backTrack(map, digits, index+1, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
