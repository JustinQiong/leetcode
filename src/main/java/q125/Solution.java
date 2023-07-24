package q125;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);
            if (leftCh == rightCh ||
                    (Character.isLetter(leftCh) && Character.isLetter(rightCh)
                            && Character.toLowerCase(leftCh) == Character.toLowerCase(rightCh))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
