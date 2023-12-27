package j.y2023.dec.q541;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseStr() {
        Solution solution = new Solution();
        assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2));
        assertEquals("bacd", solution.reverseStr("abcd", 2));
    }
}