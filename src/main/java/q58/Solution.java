package q58;

class Solution {

    public int lengthOfLastWord(String s) {
        int start = s.length() - 1;
        int end = s.length() - 1;

        // 跳过末尾的空格
        while (s.charAt(start) == ' ') {
            start--;
            end--;
        }

        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
