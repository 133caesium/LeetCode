package LeetCode.Problem704;

public class Solution {
    public int search(int[] nums, int target) {
        int location = -1;
        int lowBound = 0, highBound = nums.length;
        while((lowBound)!=highBound) {
            int midpoint = lowBound + (highBound-lowBound)/2;
            if(nums[midpoint]==target) {
                location = midpoint;
                break;
            } else if (nums[midpoint]<target){
                lowBound = midpoint+1;
            } else {
                highBound = midpoint;
            }
        }
        return location;
    }
}
