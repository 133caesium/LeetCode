package LeetCode.Problem26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution testSolution = new Solution();
    int[] test1 = new int[]{1,1,2};
    int[] test2 = new int[]{0,0,1,1,1,2,2,3,3,4};
    int solution1 = 2;
    int solution2 = 5;

    @Test
    void removeDuplicates() {
        assertEquals(solution1,testSolution.removeDuplicates(test1));
        assertEquals(solution2,testSolution.removeDuplicates(test2));
        assertNotEquals(solution1,testSolution.removeDuplicates(test2));
    }
}