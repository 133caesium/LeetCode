package LeetCode.Problem6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @Test
    void lengthOfLongestSubstring() {
        this.solution = new Solution();
        assertEquals("A",this.solution.convert("A", 1));
        assertEquals("A",this.solution.convert("A", 2));
        assertEquals("ACB",this.solution.convert("ABC", 2));
        assertEquals("PAHNAPLSIIGYIR",this.solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI",this.solution.convert("PAYPALISHIRING", 4));
    }
}