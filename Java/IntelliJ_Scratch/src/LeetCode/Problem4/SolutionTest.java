package LeetCode.Problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArraysOne() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        assertEquals(2.0,solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArraysTwo() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        assertEquals(2.5,solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void average() {
    }
}