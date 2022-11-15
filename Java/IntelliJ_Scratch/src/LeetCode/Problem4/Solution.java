package LeetCode.Problem4;

/**
 * 4. Median of Two Sorted Arrays
 * Hard
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * *
 * Constraints:
 *
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
        int median_index = (m+n)/2;
        boolean medianRequiresAverage = ((m+n)%2==0);
        boolean lastIncrement1 = false;
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        double median = 0.0;
        double lower_median = 0.0;
        while (nums1Pointer+nums2Pointer<median_index) {
            if (nums1[nums1Pointer]<nums2[nums2Pointer]) {
                nums1Pointer++;
                lower_median = median;
                median = (double) nums2[nums2Pointer];
                lastIncrement1 = true;
            } else {
                nums2Pointer++;
                lower_median = median;
                median = (double) nums1[nums1Pointer];
                lastIncrement1 = false;
            }
        }
        System.out.println(medianRequiresAverage);
        if (medianRequiresAverage) {
            return (median+lower_median)/2;
        } else {
            return median;
        }

//        if (medianRequiresAverage) {
//            if (lastIncrement1)
//                return (double) nums2[nums2Pointer];
//            else {
//                return (double) nums1[nums1Pointer];
//            }
//        } else {
//            return median;
//            }
//        }

    }

    public double average(int number1, int number2) {
        double result = (double) number1/number2;
        return result;
    }

}
