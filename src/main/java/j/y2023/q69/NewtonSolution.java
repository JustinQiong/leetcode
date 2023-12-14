package j.y2023.q69;

public class NewtonSolution {

    public int mySqrt(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x/a) / 2;
        }

        return (int) a;
    }
}
