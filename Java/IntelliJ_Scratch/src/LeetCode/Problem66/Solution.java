package LeetCode.Problem66;

class Solution {
    public int[] plusOne(int[] digits) {

        int increment_index = digits.length-1;
        boolean carry = digits[increment_index]==9;
        while (carry & increment_index!=0) {
            digits[increment_index] = 0;
            increment_index--;
            carry = digits[increment_index]==9;
        }
        digits[increment_index]++;
        if (digits[increment_index]==10) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}