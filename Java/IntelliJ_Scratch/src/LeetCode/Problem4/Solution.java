package LeetCode.Problem4;

/**
 * 4. Median of Two Sorted Arrays
 * Hard
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * *
 * Constraints:
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * Accepted
 * 1,671,022
 * Submissions
 * 4,736,108
 */

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int median_index = (m + n) / 2;
        boolean medianRequiresAverage = ((m + n) % 2 == 0);
        boolean lastIncrement1 = false;
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int medianLower, medianHigher;
        double median = 0.0;
        double lower_median = 0.0;

        int[] combined = new int[m + n];
        while (nums1Pointer + nums2Pointer <= median_index) {
            if (nums1Pointer >= m) {
                combined[nums1Pointer + nums2Pointer] = nums2[nums2Pointer];
                nums2Pointer++;
            } else if (nums2Pointer >= n) {
                combined[nums1Pointer + nums2Pointer] = nums1[nums1Pointer];
                nums1Pointer++;
            } else {
                if (nums1[nums1Pointer] < nums2[nums2Pointer]) {
                    combined[nums1Pointer + nums2Pointer] = nums1[nums1Pointer];
                    nums1Pointer++;
                } else {
                    combined[nums1Pointer + nums2Pointer] = nums2[nums2Pointer];
                    nums2Pointer++;
                }
            }
        }
        if (medianRequiresAverage) {
            return average(combined[median_index - 1], combined[median_index]);
        } else {
            return (double) combined[median_index];
        }
    }

    public double average(int number1, int number2) {
        double result = (double) (number1 + number2) / 2;
        return result;
    }

}
