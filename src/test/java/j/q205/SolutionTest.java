package j.q205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isIsomorphic() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphic("egg", "add"));
        assertFalse(solution.isIsomorphic("foo", "bar"));
        assertTrue(solution.isIsomorphic("paper", "title"));
    }
}