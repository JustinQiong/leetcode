package j.y2023.dec.test;

/**
 * Make Array Consecutive 2
 * Find the max and min value of the array.
 * max - min + 1 - n is the missed elements number.
 */
public class Main {

    public int solution(int[] statues) {
        int n = statues.length;
        int max = -1, min = 21;
        for (int i = 0; i < n; i++) {
            int curr = statues[i];
            max = Math.max(max, curr);
            min = Math.min(min, curr);
        }

        return max - min + 1 - n;
    }
}
