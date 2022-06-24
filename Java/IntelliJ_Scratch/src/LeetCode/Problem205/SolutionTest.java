package LeetCode.Problem205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isIsomorphic() {
        Solution solution = new Solution();
        assertEquals(true, solution.isIsomorphic("egg", "add"));
        assertEquals(false, solution.isIsomorphic("foo", "bar"));
        assertEquals(true, solution.isIsomorphic("paper", "title"));
    }
}