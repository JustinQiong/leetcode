package j.q374;

public class Solution extends GuessGame {

    public Solution(int n) {
        super(n);
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int guess = left + (right - left) / 2;
            int res = guess(guess);
            if (res == 0) {
                return guess;
            } else if (res == -1) {
                right = guess - 1;
            } else {
                left = guess + 1;
            }
        }

        return 0;
    }
}
