package LeetCode.Problem27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length ; i++, j++) {
            if (nums[i]!=val) {
                if (i!=j) {
                    nums[j] = nums[i];
                }
            } else {
                j--;
            }
        }
        return j;
    }
}