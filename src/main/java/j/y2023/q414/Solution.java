package j.y2023.q414;

public class Solution {

    public int thirdMax(int[] nums) {
        Integer a = null, b = null, c = null;
        for (int n : nums) {
            if (a == null || n > a) {
                c = b;
                b = a;
                a = n;
            } else if (n < a && (b == null || n > b)) {
                c = b;
                b = n;
            } else if (b != null && n < b && (c == null || n > c)) {
                c = n;
            }
        }

        return c == null ? a : c;
    }
}
