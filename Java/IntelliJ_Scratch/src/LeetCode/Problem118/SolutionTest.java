package LeetCode.Problem118;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generate() {
        Solution solution = new Solution();
        List<List<Integer>> pascalTriangle = new ArrayList();
        List<Integer> pascalFirstLine = new ArrayList<>();
        pascalFirstLine.add(1);
        pascalTriangle.add(pascalFirstLine);
        assertEquals(pascalTriangle, solution.generate(1));
        List<Integer> pascalSecondLine = new ArrayList<>();
        pascalSecondLine.add(1);
        pascalSecondLine.add(1);
        pascalTriangle.add(pascalSecondLine);
        assertEquals(pascalTriangle, solution.generate(2));
        List<Integer> pascalThirdLine = new ArrayList<>();
        pascalThirdLine.add(1);
        pascalThirdLine.add(2);
        pascalThirdLine.add(1);
        pascalTriangle.add(pascalThirdLine);
        assertEquals(pascalTriangle, solution.generate(3));
    }
}