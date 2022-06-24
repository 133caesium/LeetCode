package LeetCode.Problem1480;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void runningSum() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1,3,6,10}), Arrays.toString(solution.runningSum(new int[]{1,2,3,4})));
    }

}