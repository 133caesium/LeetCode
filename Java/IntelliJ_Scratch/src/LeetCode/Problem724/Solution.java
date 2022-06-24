package LeetCode.Problem724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int strictLeftSum = 0;
        int strictRightSum = 0;
        for (int num:nums) {strictRightSum+=num;}
        strictRightSum-=nums[0];
        if (strictLeftSum==strictRightSum) {
            pivotIndex = 0;
        } else {
            for (int i = 1; i < nums.length; i++) {
                strictLeftSum += nums[i - 1];
                strictRightSum -= nums[i];
                if (strictLeftSum == strictRightSum) {
                    pivotIndex = i;
                    break;
                }
            }
        }
        return pivotIndex;
    }
}
