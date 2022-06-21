package LeetCode.Problem66;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test_plus_one() {
        Solution solution = new Solution();
        int[] two_digits = {4, 5};
        int[] two_digits_plus_one = {4, 6};
        assertEquals(Arrays.toString(two_digits_plus_one), Arrays.toString(solution.plusOne(two_digits)));
        int[] three_digits = {4, 5, 9};
        int[] three_digits_plus_one = {4, 6, 0};
        assertEquals(Arrays.toString(three_digits_plus_one), Arrays.toString(solution.plusOne(three_digits)));
        int[] four_digits = {9, 9, 9, 9};
        int[] four_digits_plus_one = {1, 0, 0, 0, 0};
        assertEquals(Arrays.toString(four_digits_plus_one), Arrays.toString(solution.plusOne(four_digits)));
    }
}