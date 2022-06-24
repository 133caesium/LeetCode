package LeetCode.Problem14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution solution = new Solution();
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("c", solution.longestCommonPrefix(new String[]{"cir","car"}));
    }
}