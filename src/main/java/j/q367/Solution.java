package j.q367;

public class Solution {

    public boolean isPerfectSquare(int num) {
        double sqr = sqrt(num);
        return (int) sqr * (int) sqr == num;
    }

    public double sqrt(int num) {
        double n = num;
        while (n * n > num) {
            double pre = n;
            n = (num / n + n) / 2;
            if (pre - n < 1e-10) {
                break;
            }
        }
        return n;
    }
}
