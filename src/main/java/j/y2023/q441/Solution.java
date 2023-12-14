package j.y2023.q441;

public class Solution {

    public int arrangeCoins(int n) {
        return (int) (Math.sqrt((long) 8 * n + 1) - 1) / 2;
    }

    public int arrangeCoinsBinarySearch(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = (left + right) >> 1;
            long res = mid * (mid + 1) / 2;
            if (res == (long) n) {
                return (int) mid;
            } else if (res > (long) n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (int) right;
    }
}
