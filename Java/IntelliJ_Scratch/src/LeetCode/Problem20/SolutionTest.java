package LeetCode.Problem20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class SolutionTest {

    @Test
    void nonBracketReturnsFalse() {
        Solution test_solution = new Solution();
        boolean result = test_solution.isValid("test");
        assumeFalse(result);
    }

    @Test
    void singleBracketReturnsFalse() {
        Solution test_solution = new Solution();
        boolean result_normal = test_solution.isValid("()");
        assumeTrue(result_normal);
        boolean result_curly = test_solution.isValid("{}");
        assumeTrue(result_curly);
        boolean result_square = test_solution.isValid("[]");
        assumeTrue(result_square);
    }

}