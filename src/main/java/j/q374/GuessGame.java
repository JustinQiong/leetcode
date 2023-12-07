package j.q374;

import java.util.Random;

public class GuessGame {

    private int answer;

    public GuessGame(int n) {
        Random random = new Random();
        answer = random.nextInt(n);
    }

    public int guess(int num) {
        if (answer == num) {
            return 0;
        } else if (answer > num) {
            return -1;
        } else {
            return 1;
        }
    }
}
