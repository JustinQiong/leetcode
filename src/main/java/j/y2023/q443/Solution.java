package j.y2023.q443;

public class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int read = 0;
        while (read < n) {
            int curr = read;
            while (read < n && chars[read] == chars[curr]) {
                read++;
            }

            chars[write++] = chars[curr];

            int count = read - curr;
            if (count > 1) {
                int start = write;
                while (count > 0) {
                    chars[write++] = (char) (count % 10 + '0');
                    count /= 10;
                }
                reverse(chars, start, write - 1);
            }
        }

        return write;
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
