package LeetCode.Problem3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @Test
    void lengthOfLongestSubstring() {
        this.solution = new Solution();
        assertEquals(3,this.solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1,this.solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3,this.solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0,this.solution.lengthOfLongestSubstring(""));
        assertEquals(1,this.solution.lengthOfLongestSubstring(" "));
        assertEquals(3,this.solution.lengthOfLongestSubstring("dvdf"));
        assertEquals(6,this.solution.lengthOfLongestSubstring("asjrgapa"));
    }
}