package LeetCode.Problem392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubsequence() {
        Solution solution = new Solution();
        assertEquals(true, solution.isSubsequence("abc", "ahbgdc"));
        assertEquals(false, solution.isSubsequence("axc", "ahbgdc"));
        assertEquals(true, solution.isSubsequence("", "title"));
        assertEquals(false, solution.isSubsequence("acb", "ahbgdc"));
    }
}