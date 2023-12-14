package j.y2023.q118;

import j.y2023.q118.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generate() {
        Solution solution = new Solution();
        List<List<Integer>> res = solution.generate(5);
        assertIterableEquals(List.of(1), res.get(0));
        assertIterableEquals(List.of(1, 1), res.get(1));
        assertIterableEquals(List.of(1, 2, 1), res.get(2));
        assertIterableEquals(List.of(1, 3, 3, 1), res.get(3));
        assertIterableEquals(List.of(1, 4, 6, 4, 1), res.get(4));

        List<List<Integer>> res1 = solution.generate(1);
        assertIterableEquals(List.of(1), res.get(0));
    }
}