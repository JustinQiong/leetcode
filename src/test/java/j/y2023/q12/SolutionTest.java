package j.y2023.q12;

import j.y2023.q12.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intToRoman() {
        Solution solution = new Solution();
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("LVIII", solution.intToRoman(58));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}