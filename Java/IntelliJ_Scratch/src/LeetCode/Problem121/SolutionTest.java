package LeetCode.Problem121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(1, solution.maxProfit(new int[]{1,2}));
        assertEquals(3, solution.maxProfit(new int[]{2,1,4}));
        assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
        assertEquals(0, solution.maxProfit(new int[]{1}));
        assertEquals(0, solution.maxProfit(new int[]{}));
        assertEquals(10, solution.maxProfit(new int[]{1,2,3,4,5,7,8,9,11,10}));
    }
}