package j.y2023.q268;

import j.y2023.q268.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void missingNumberMath() {
        Solution solution = new Solution();
        assertEquals(2, solution.missingNumberMath(new int[]{3,0,1}));
        assertEquals(2, solution.missingNumberMath(new int[]{0,1}));
        assertEquals(8, solution.missingNumberMath(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, solution.missingNumberMath(new int[]{0}));
    }

    @Test
    void missingNumberDigit() {
        Solution solution = new Solution();
        assertEquals(2, solution.missingNumberDigit(new int[]{3,0,1}));
        assertEquals(2, solution.missingNumberDigit(new int[]{0,1}));
        assertEquals(8, solution.missingNumberDigit(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, solution.missingNumberDigit(new int[]{0}));
    }
}