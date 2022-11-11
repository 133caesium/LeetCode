package LeetCode.Problem26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int readPointer, writePointer, end;
        int lastNumber = nums[0];
        readPointer = 1;
        writePointer = 1;
        end = nums.length;
        while (readPointer<end) {
            if (nums[readPointer] != lastNumber){
                lastNumber= nums[readPointer];
                nums[writePointer] = lastNumber;
                writePointer++;
            }
            readPointer++;
        }
        return writePointer;
    }
}
