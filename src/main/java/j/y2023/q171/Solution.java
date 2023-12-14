package j.y2023.q171;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            num = num * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return num;
    }
}
