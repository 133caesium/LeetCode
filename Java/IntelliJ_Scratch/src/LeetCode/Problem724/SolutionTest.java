package LeetCode.Problem724;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pivotIndex() {
        Solution solution = new Solution();
        assertEquals(3, solution.pivotIndex(new int[]{1,7,3,6,5,6}));
        assertEquals(-1, solution.pivotIndex(new int[]{1,2,3}));
        assertEquals(0, solution.pivotIndex(new int[]{2, 1,-1}));
    }
}