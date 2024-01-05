package j.y2024.jan.q399;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void calcEquation() {
        Solution solution = new Solution();
        assertArrayEquals(new double[]{6.00000D, 0.50000D, -1.00000D, 1.00000D, -1.00000D},
                solution.calcEquation(List.of(List.of("a", "b"), List.of("b", "c")),
                        new double[]{2.0D, 3.0D},
                        List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"))));
    }
}