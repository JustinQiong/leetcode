package j.q9;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int pa = 0;
        while (pa < x) {
            pa = x % 10 + pa * 10;
            x /= 10;
        }
        return pa / 10 == x || pa == x;
    }
}
