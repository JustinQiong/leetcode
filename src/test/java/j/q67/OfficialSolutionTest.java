package j.q67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OfficialSolutionTest {

    @Test
    void addBinaryTest() {
        OfficialSolution solution = new OfficialSolution();
        assertEquals("0", solution.addBinary("0", "0"));
        assertEquals("100", solution.addBinary("11", "1"));
        assertEquals("10101", solution.addBinary("1010", "1011"));
        assertEquals("11", solution.addBinary("10", "1"));
        assertEquals("11110", solution.addBinary("1111", "1111"));
    }
}