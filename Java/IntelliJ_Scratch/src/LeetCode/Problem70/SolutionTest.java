package LeetCode.Problem70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs() {
        Solution solution = new Solution();
        assertEquals(1,solution.climbStairs(1));
        assertEquals(2,solution.climbStairs(2));
        assertEquals(3,solution.climbStairs(3));
        assertEquals(14930352,solution.climbStairs(35));
        assertEquals(1134903170,solution.climbStairs(44));
    }
}