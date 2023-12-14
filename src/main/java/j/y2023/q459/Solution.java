package j.y2023.q459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).indexOf(s, 1) != s.length();
    }
}
