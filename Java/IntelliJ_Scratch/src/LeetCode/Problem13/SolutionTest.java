package LeetCode.Problem13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToInt() {
        Solution solution = new Solution();
        assertEquals(10,solution.romanToInt("X"));
        assertEquals(9,solution.romanToInt("IX"));
        assertEquals(3999,solution.romanToInt("MMMCMXCIX"));
    }
}