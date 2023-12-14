package j.y2023.q415;

import j.y2023.q415.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void addStringsTest() {
        Solution solution = new Solution();
        assertEquals("134", solution.addStrings("11", "123"));
        assertEquals("0", solution.addStrings("0", "0"));
    }
}