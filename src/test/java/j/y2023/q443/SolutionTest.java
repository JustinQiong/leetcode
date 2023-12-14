package j.y2023.q443;

import j.y2023.q443.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void compress() {
        Solution solution = new Solution();
        assertEquals(6, solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        assertEquals(5, solution.compress(new char[]{'a', 'a', 'b', 'c', 'c', 'c'}));
        assertEquals(1, solution.compress(new char[]{'a'}));
        assertEquals(4, solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}